package com.fatec.neweducation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String defaultPage(ModelMap model) {
        //return "index";
        return "/homeAdmin";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String indexPage(ModelMap model) {
        return "index";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String aboutPage(ModelMap model) {
        return "aboutAdmin";
    }

    @RequestMapping(value = "/developer", method = RequestMethod.GET)
    public String developerPage(ModelMap model) {
        return "developerAdmin";
    }

    @RequestMapping(value = "/homeadmin", method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        //Logica para definir se o usuario logado é admin ou não
        return "/homeAdmin";
    }
}