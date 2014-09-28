package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.PlayerSchoolGrade;
import com.fatec.neweducation.model.Standart;
import com.fatec.neweducation.model.User;
import com.fatec.neweducation.service.GameService;
import com.fatec.neweducation.service.PlayerSchoolGradeService;
import com.fatec.neweducation.service.PlayerService;
import com.fatec.neweducation.service.StandartService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by glaucia on 31/07/14.
 */
@Controller
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @Autowired
    private StandartService standartService;

    @Autowired
    private PlayerService playertService;

    @Autowired
    private PlayerSchoolGradeService playerSchoolGradeService;

    //Beans do jogador
    private Player player;
    private User user;
    private PlayerSchoolGrade playerSchoolGrade;

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
        this.playerSchoolGrade = this.playerSchoolGradeService.findByPlayer(player).get(-1);
        modelAndView.addObject("title", "Bem vindo " + user.getNameUser());
        modelAndView.addObject("listGames", this.standartService.findByPlayer(player));
        return modelAndView;
    }

    //Fazer teste sobre a melhor chamada na url
    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public ModelAndView startGame(@PathVariable Long id) {
        /**
         * Recebe o id do standart selecionado Busca as questões para montar o
         * jogo seleciona a primeira questão cria o fakeGame renderiza a tela
         * apartir do "type" da question selecionada em cada resposta o link não
         * deve ser alterado, deve gera um "post" para o objeto salvar o Game e
         * ser renderizado para a proxima questão até o fim da lista no fim da
         * lista de ir para uma pagina agradecendo pelo jogo deve somar 1 ao
         * level do standart (se, somente se, não for igual a 10) Disponibilizar
         * uma opção para voltar para a pagina inicial # o botão pular anula o
         * fakeGame e vai para o proximo # o botão voltar cancela o jogo sem
         * cancelar os fakes games já passados e vai para a pagina de
         * agradecimento
         */
        ModelAndView modelAndView = new ModelAndView("JOGO");
        return modelAndView;
    }

}
