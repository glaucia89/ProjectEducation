package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.PlayerSchoolGrade;
import com.fatec.neweducation.model.School;
import com.fatec.neweducation.service.PlayerSchoolGradeService;
import com.fatec.neweducation.service.PlayerService;
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
@RequestMapping("/PlayerSchoolGrade/")
public class PlayerSchoolGradeController {

    @Autowired
    private PlayerSchoolGradeService playerSchoolGradeService;

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private PlayerService playerService;

    /*O Ano letivo deve ser adicionado por aluno passando o id do mesmo

     */
    @RequestMapping(value = "/add{id}", method = RequestMethod.GET)
    public ModelAndView initAddSchool(@PathVariable Integer id) {

        ModelAndView modelAndView = new ModelAndView("formplayerschoolgrade");
        PlayerSchoolGrade playerschoolgrade = new PlayerSchoolGrade();
        Player player = this.playerService.findPlayerById(id);
        List<School> listSchools = this.schoolService.findAll();

        modelAndView.addObject("titulo", "Adicionar ano letivo");
        modelAndView.addObject("playerschoolgrade", playerschoolgrade);
        modelAndView.addObject("player", player);
        modelAndView.addObject("schools", listSchools);

        return modelAndView;
    }

    /*Após salvar deve mostar mensagem de confirmação e voltar para a tela Home de usuarios

     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("playerschoolgrademodel") PlayerSchoolGrade playerSchoolGradeModel) {
        ModelAndView modelAndView = new ModelAndView("homeuser");
        modelAndView.addObject("titulo", "Aluno por Ano Letivo");
        this.playerSchoolGradeService.savePlayerSchoolGrade(playerSchoolGradeModel);
        modelAndView.addObject("message", "Novo Ano letivo registrado com sucesso !");
        return modelAndView;
    }

}
