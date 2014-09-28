package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.School;
import com.fatec.neweducation.model.dto.FakeStandart;
import com.fatec.neweducation.model.resources.Hability;
import com.fatec.neweducation.service.PlayerService;
import com.fatec.neweducation.service.StandartService;
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
@RequestMapping(value = "/standart")
public class StandartController {

    @Autowired
    private StandartService standartService;

    @Autowired
    private PlayerService playerService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("homeStandart");
        return modelAndView;
    }

    @RequestMapping(value = "/add{id}", method = RequestMethod.GET)
    public ModelAndView initAddSchool(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("formStandart");
        FakeStandart standart = new FakeStandart();
        standart.setIdPlayer(id);
        modelAndView.addObject("title", "Adicionar Questionario a aluno");
        modelAndView.addObject("standart", standart);
        modelAndView.addObject("habilities", Hability.values());
        return modelAndView;
    }

    @RequestMapping(value = "/add{id}", method = RequestMethod.POST)
    public String save(@ModelAttribute("standartmodel") FakeStandart standartmodel) {
        Player player = this.playerService.findById(standartmodel.getIdPlayer());
        standartmodel.setPlayer(player);
        this.standartService.save(standartmodel.getStandart());
        //modelAndView.addObject("message", "Escola " + schoolmodel.getTitle() + " foi salva com sucesso");
        return "redirect:/player";
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.GET)
    public String initEditSchool(@PathVariable Integer id) {
        return "redirect:/player";
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.POST)
    public String update(@ModelAttribute School school, @PathVariable Long id) {
        return "redirect:/player";
    }

    @RequestMapping(value = "/delete{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Integer id) {
        return "redirect:/player";
    }
}
