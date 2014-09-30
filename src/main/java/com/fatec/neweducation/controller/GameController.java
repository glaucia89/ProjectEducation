package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.Answer;
import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.PlayerSchoolGrade;
import com.fatec.neweducation.model.Question;
import com.fatec.neweducation.model.Standart;
import com.fatec.neweducation.model.User;
import com.fatec.neweducation.model.dto.FakeGame;
import com.fatec.neweducation.model.dto.GameResponse;
import com.fatec.neweducation.service.AnswerService;
import com.fatec.neweducation.service.GameService;
import com.fatec.neweducation.service.PlayerSchoolGradeService;
import com.fatec.neweducation.service.PlayerService;
import com.fatec.neweducation.service.QuestionService;
import com.fatec.neweducation.service.StandartService;
import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by glaucia on 31/07/14.
* Recebe o id do standart selecionado Busca as
 * questões para montar o jogo seleciona a primeira questão cria o fakeGame
 * renderiza a tela apartir do "type" da question selecionada em cada resposta o
 * link não deve ser alterado, deve gera um "post" para o objeto salvar o Game e
 * ser renderizado para a proxima questão até o fim da lista no fim da lista de
 * ir para uma pagina agradecendo pelo jogo deve somar 1 ao level do standart
 * (se, somente se, não for igual a 10) Disponibilizar uma opção para voltar
 * para a pagina inicial # o botão pular anula o fakeGame e vai para o proximo #
 * o botão voltar cancela o jogo sem cancelar os fakes games já passados e vai
 * para a pagina de agradecimento
 */
@Controller
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @Autowired
    private StandartService standartService;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private AnswerService answerService;

    @Autowired
    private PlayerService playertService;

    @Autowired
    private PlayerSchoolGradeService playerSchoolGradeService;

    //Beans do jogador
    private Player player;
    private User user;
    private PlayerSchoolGrade playerSchoolGrade;
    private List<Question> listQuestion;
    private Integer cont;
    private FakeGame game;

    //Standart selecionavel na primeira tela
    private Standart standart;

    //Ajuda na contagem de questões para andar com a lista
    private Integer contQuestion;

    //Telas
    private String GAME_PLAYER = "gamePlayer";
    private String GAME = "gameQuestionFAE";

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView("gamePlayer");
        this.user = (User) session.getAttribute("user");
        this.player = this.playertService.findByUser(user).get(0);
        this.playerSchoolGrade = this.playerSchoolGradeService.findByPlayer(player).get(0);
        modelAndView.addObject("title", "Bem vindo " + user.getNameUser());
        modelAndView.addObject("listGames", this.standartService.findByPlayer(player));
        return modelAndView;
    }

    //Fazer teste sobre a melhor chamada na url
    @RequestMapping(value = "/start{id}", method = RequestMethod.GET)
    public String startGame(@PathVariable Integer id) {
        this.standart = this.standartService.findById(id);
        this.listQuestion = this.questionService.findByfindByStandart(standart);
        cont = 0;
        return "redirect:/game/play";
    }

    @RequestMapping(value = "/play", method = RequestMethod.GET)
    public ModelAndView game() {
        this.game = this.makeFake(cont);
        ModelAndView modelAndView = new ModelAndView(this.GAME);
        modelAndView.addObject("game", game);
        return modelAndView;
    }

    @RequestMapping(value = "/play", method = RequestMethod.POST)
    public String gameSave(@ModelAttribute GameResponse modelgame) {
        cont += 1;
        if (cont <= 4) {
            this.game.setCorrectResponse(this.responseIsCorrect(modelgame, game));
            this.gameService.save(game.getGame());
            return "redirect:/game/play";
        }
        cont = 0;
        return "redirect:/game";
    }

    @RequestMapping(value = "/gap", method = RequestMethod.GET)
    public String gameGap() {
        cont += 1;
        if (cont <= 4) {
            return "redirect:/game/play";
        }
        cont = 0;
        return "redirect:/game";
    }

    @RequestMapping(value = "/back", method = RequestMethod.GET)
    public String gameBack() {
        cont = 0;
        return "redirect:/game";
    }

    /**
     * Recebe o nume da lista de questões que deve ser apresentada e retorna na
     * tela a fakequestion
     *
     * @param number
     * @return fakeGame
     */
    public FakeGame makeFake(Integer number) {
        FakeGame fakeGame = new FakeGame();
        Question question = listQuestion.get(number);
        fakeGame.setQuestion(question);
        fakeGame.setStandart(this.standart);
        fakeGame.setPlayerSchoolGrade(this.playerSchoolGrade);
        List<Answer> listAnswers = this.answerService.findByQuestion(question);
        Collections.shuffle(listAnswers);
        if (listAnswers.size() >= 1) {
            fakeGame.setAnswerA(listAnswers.get(0));
        }
        if (listAnswers.size() >= 2) {
            fakeGame.setAnswerB(listAnswers.get(1));
        }
        if (listAnswers.size() >= 3) {
            fakeGame.setAnswerC(listAnswers.get(2));
        }
        return fakeGame;
    }

    public Boolean responseIsCorrect(GameResponse response, FakeGame game) {
        if (response.isResponseA() != null) {
            if (response.isResponseA()) {
                if (game.getAnswerA().getIsCorrect()) {
                    return true;
                }
            }
        }
        if (response.isResponseB() != null) {
            if (response.isResponseB()) {
                if (game.getAnswerB().getIsCorrect()) {
                    return true;
                }
            }
        }
        if (response.isResponseC() != null) {
            if (response.isResponseC()) {
                if (game.getAnswerC().getIsCorrect()) {
                    return true;
                }
            }
        }
        return false;
    }

}
