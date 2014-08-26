package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.School;
import com.fatec.neweducation.model.resources.City;
import com.fatec.neweducation.model.resources.State;
import com.fatec.neweducation.service.SchoolService;
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
@RequestMapping(value = "/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("homeschool");
        modelAndView.addObject("title", "Escolas");
        List<School> list = this.schoolService.findAll();
        modelAndView.addObject("schools", list);
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView initAddSchool() {
        ModelAndView modelAndView = new ModelAndView("formSchool");
        School school = new School();
        modelAndView.addObject("title", "Adicionar Escola");
        modelAndView.addObject("school", school);
        modelAndView.addObject("cities", City.values());
        modelAndView.addObject("states", State.values());
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("schoolmodel") School schoolmodel) {
        ModelAndView modelAndView = new ModelAndView("homeschool");
        modelAndView.addObject("title", "Escolas");
        //schoolmodel.setId(3l);
        this.schoolService.saveSchool(schoolmodel);
        modelAndView.addObject("schools", this.schoolService.findAll());
        modelAndView.addObject("message", "Escola " + schoolmodel.getTitle() + " foi salva com sucesso");
        return modelAndView;
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.GET)
    public ModelAndView initEditSchool(@PathVariable Integer id) {
        School school = this.schoolService.findSchoolById(id);
        ModelAndView modelAndView = new ModelAndView("formSchool");
        modelAndView.addObject("title", "Editar Escola");
        modelAndView.addObject("school", school);
        modelAndView.addObject("cities", City.values());
        modelAndView.addObject("states", State.values());
        return modelAndView;
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.POST)
    public ModelAndView update(@ModelAttribute School school, @PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("homeschool");
        modelAndView.addObject("title", "Escolas");
        this.schoolService.updateSchool(school);
        modelAndView.addObject("schools", this.schoolService.findAll());
        modelAndView.addObject("messagee", "Escola " + school.getTitle() + " editado com sucesso!");
        return modelAndView;
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
