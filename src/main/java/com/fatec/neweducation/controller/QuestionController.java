package com.fatec.neweducation.controller;

import com.fatec.neweducation.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by glaucia on 31/07/14.
 */
@Controller
@RequestMapping("/Question/")
public class QuestionController {

    @Autowired
    private QuestionService questionService;
}
