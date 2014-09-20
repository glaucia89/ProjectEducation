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
@RequestMapping("/player")
public class PlayerController {


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
        modelAndView.addObject("players", this.playerService.findAll());
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView initAddPlayer() {
        ModelAndView modelAndView = new ModelAndView("formPlayer");
        FakeUserPlayer player = new FakeUserPlayer();
        modelAndView.addObject("title", "Adicionar Estudante");
        modelAndView.addObject("player", player);
        modelAndView.addObject("genders", Gender.values());
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@ModelAttribute("modelplayer") FakeUserPlayer modelPlayer) {
        this.playerService.save(modelPlayer.getPlayer());
        //modelAndView.addObject("message", "Estudante " + modelPlayer.getName() + " foi salvo com sucesso");
        return "redirect:/player";
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.GET)
    public ModelAndView initEditPlayer(@PathVariable Integer id) {
        Player player = this.playerService.findById(id);
        FakeUserPlayer psg = new FakeUserPlayer();
        psg.setUser(player.getFkUser());
        psg.setPlayer(player);
        //psg.setListSchool(this.playerSchoolGradeService.findByPlayer(player));
        ModelAndView modelAndView = new ModelAndView("formPlayer");
        modelAndView.addObject("title", "Editar Estudante");
        modelAndView.addObject("player", psg);
        modelAndView.addObject("genders", Gender.values());
        return modelAndView;
    }

    @RequestMapping(value = "/edit{id}", method = RequestMethod.POST)
    public String update(@ModelAttribute FakeUserPlayer modelFakePlayer, @PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("homePlayer");
        this.playerService.update(modelFakePlayer.getPlayer());
        modelAndView.addObject("message", "Estudante " + modelFakePlayer.getName() + " editado com sucesso!");
        return "redirect:/player";
    }

    @RequestMapping(value = "/delete{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Integer id) {
        Player player = this.playerService.findById(id);
        this.playerService.delete(player.getId());
        return "redirect:/player";
    }
}
