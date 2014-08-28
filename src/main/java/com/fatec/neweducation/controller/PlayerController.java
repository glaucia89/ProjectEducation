package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.School;
import com.fatec.neweducation.model.dto.FakeUserPlayer;
import com.fatec.neweducation.model.resources.City;
import com.fatec.neweducation.model.resources.Gender;
import com.fatec.neweducation.model.resources.State;
import com.fatec.neweducation.service.PlayerSchoolGradeService;
import com.fatec.neweducation.service.PlayerService;
import com.fatec.neweducation.service.SchoolService;
import com.fatec.neweducation.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by glaucia on 31/07/14.
 */
@Controller
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private PlayerService playerService;

    @Autowired
    private UserService userService;
    
    @Autowired
    private PlayerSchoolGradeService playerSchoolGradeService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("homePlayer");
        modelAndView.addObject("title", "Estudantes");
        List<Player> list = this.playerService.findAll();
        modelAndView.addObject("players", list);
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView initAddPlayer() {
        ModelAndView modelAndView = new ModelAndView("formPlayer");
        FakeUserPlayer player = new FakeUserPlayer();
        modelAndView.addObject("title", "Adicionar Estudante");
        modelAndView.addObject("player", player);
        modelAndView.addObject("schools", this.schoolService.findAll());
        modelAndView.addObject("gender", Gender.values());
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@ModelAttribute("playermodel") FakeUserPlayer playermodel) {
        ModelAndView modelAndView = new ModelAndView("homePlayer");
        Integer idUser = this.userService.saveUser(playermodel.getUser());
        playermodel.setIdUser(idUser);
        Integer idPlayer = this.playerService.savePlayer(playermodel.getPlayer());
        playermodel.setIdPlayer(idPlayer);
        this.playerSchoolGradeService.savePlayerSchoolGrade(playermodel.getPlayerSchoolGrade());
        modelAndView.addObject("title", "Estudantes");
        List<Player> list = this.playerService.findAll();
        modelAndView.addObject("players", list);
        modelAndView.addObject("message", "Estudante " + playermodel.getName() + " foi salvo com sucesso");
        return "redirect:/player";
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.GET)
    public ModelAndView initEditSchool(@PathVariable Integer id) {
        Player player = this.playerService.findPlayerById(id);
        ModelAndView modelAndView = new ModelAndView("formPlayer");
        modelAndView.addObject("title", "Editar Estudante");
        modelAndView.addObject("player", player);
        modelAndView.addObject("states", State.values());
        return modelAndView;
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.POST)
    public String update(@ModelAttribute School school, @PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("homeschool");
        modelAndView.addObject("title", "Escolas");
        this.schoolService.updateSchool(school);
        modelAndView.addObject("schools", this.schoolService.findAll());
        modelAndView.addObject("messagee", "Escola " + school.getTitle() + " editado com sucesso!");
        return "redirect:/school";
    }

    @RequestMapping(value = "/delete{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable Integer id) {
        this.schoolService.deleteSchoolbyId(id);
        ModelAndView modelAndView = new ModelAndView("homeschool");
        modelAndView.addObject("title", "Escolas");
        modelAndView.addObject("message", "Escola deletada com sucesso!");
        modelAndView.addObject("schools", this.schoolService.findAll());
        return modelAndView;
    }
}
