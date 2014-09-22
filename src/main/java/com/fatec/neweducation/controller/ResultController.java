package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.User;
import com.fatec.neweducation.model.dto.FakeUserPlayer;
import com.fatec.neweducation.model.resources.Gender;
import com.fatec.neweducation.model.resources.TypeUser;
import com.fatec.neweducation.service.PlayerSchoolGradeService;
import com.fatec.neweducation.service.PlayerService;
import com.fatec.neweducation.service.UserService;
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
@RequestMapping("/result")
public class ResultController {


    @Autowired
    private PlayerService playerService;

    @Autowired
    private UserService userService;

    @Autowired
    private PlayerSchoolGradeService playerSchoolGradeService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("homeResult");
        modelAndView.addObject("title", "Resultado dos Estudantes");
        modelAndView.addObject("players", this.playerService.findAll());
        return modelAndView;
    }

    @RequestMapping(value = "/ver{id}", method = RequestMethod.GET)
    public ModelAndView initResults(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("viewResult");
        return modelAndView;
    }

}
