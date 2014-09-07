package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.PlayerSchoolGrade;
import com.fatec.neweducation.service.PlayerSchoolGradeService;
import com.fatec.neweducation.service.PlayerService;
import com.fatec.neweducation.service.SchoolService;
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
@RequestMapping("/playerschool")
public class PlayerSchoolGradeController {


    @Autowired
    private PlayerService playerService;

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private PlayerSchoolGradeService playerSchoolGradeService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list() {
        //TO DO
        //Listar todos os alunos com a açao de adicionar escola
        ModelAndView modelAndView = new ModelAndView("homePlayer");
        modelAndView.addObject("title", "Estudantes");
        modelAndView.addObject("players", this.playerService.findAll());
        return modelAndView;
    }

    @RequestMapping(value = "/add{id}", method = RequestMethod.GET)
    public ModelAndView initAddPlayerSchool(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("formPlayerSchool");
        PlayerSchoolGrade psg = new PlayerSchoolGrade();
        psg.setFkPlayer(this.playerService.findById(id));
        modelAndView.addObject("title", "Adicionar Escola ao Etudante");
        modelAndView.addObject("player", psg);
        modelAndView.addObject("schools", this.schoolService.findAll());
        return modelAndView;
    }

    @RequestMapping(value = "/add{id}", method = RequestMethod.POST)
    public String save(@ModelAttribute("modelPlayer") PlayerSchoolGrade modelPlayerSchool) {
        ModelAndView modelAndView = new ModelAndView("homePlayerSchool");
        this.playerSchoolGradeService.save(modelPlayerSchool);
        modelAndView.addObject("message", "Escola " + modelPlayerSchool.getFkSchool().getTitle() + " foi adicionada com sucesso ao aluno");
        return "redirect:/player";
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.GET)
    public ModelAndView initEditPlayer(@PathVariable Integer id) {
        PlayerSchoolGrade playerSchool = this.playerSchoolGradeService.findById(id);
        ModelAndView modelAndView = new ModelAndView("formPlayer");
        modelAndView.addObject("title", "Editar Estudante");
        modelAndView.addObject("playerSchool", playerSchool);
        modelAndView.addObject("schools", this.schoolService.findAll());
        return modelAndView;
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.POST)
    public String update(@ModelAttribute PlayerSchoolGrade playerSchool, @PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("homePlayerSchool");
        this.playerSchoolGradeService.update(playerSchool);
        modelAndView.addObject("message", "Escola " + playerSchool.getFkSchool().getTitle() + " editada com sucesso!");
        return "redirect:/player";
    }

    @RequestMapping(value = "/delete{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Integer id) {
        this.playerSchoolGradeService.delete(id);
        ModelAndView modelAndView = new ModelAndView("homePlayerSchool");
        modelAndView.addObject("message", "Escola deletada com sucesso!");
        return "redirect:/player";
    }
}
