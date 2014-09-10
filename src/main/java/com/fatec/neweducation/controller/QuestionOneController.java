package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.Question;
import com.fatec.neweducation.model.resources.Hability;
import com.fatec.neweducation.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by glaucia on 31/07/14.
 */
@Controller
@RequestMapping("/question/one")
public class QuestionOneController {

    @Autowired
    private QuestionService questionService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("formQuestionOne");
        modelAndView.addObject("title", "Questões do tipo 1");
        //List<Question> list = this.questionService.findAll();
        //modelAndView.addObject("schools", list);
        return modelAndView;
    }
}
