package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.User;
import com.fatec.neweducation.model.resources.TypeQuestion;
import com.fatec.neweducation.service.GameService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView("gamePlayer");
        User user = (User) session.getAttribute("user");
        modelAndView.addObject("title", "Bem vindo " + user.getNameUser());
        return modelAndView;
    }
}
