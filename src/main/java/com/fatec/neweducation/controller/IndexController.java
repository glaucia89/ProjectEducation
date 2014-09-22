package com.fatec.neweducation.controller;

import com.fatec.neweducation.model.User;
import com.fatec.neweducation.model.resources.TypeUser;
import com.fatec.neweducation.service.UserService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView defaultPage(ModelMap model) {
        ModelAndView modelAndView = new ModelAndView("login");
        User user = new User();
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String efetuaLogin(@ModelAttribute("login") User login, HttpSession session) {
        User user = this.userService.findByName(login.getLoginUser());
        if (user != null) {
            if (login.getPassword().equals(user.getPassword())) {
                session.setAttribute("user", user);
                if (user.getTypeUser().equals(TypeUser.EDUCADOR)) {
                    return "redirect:/home";
                } else {
                    return "redirect:/game";
                }
            }
        }
        session.setAttribute("message", "Erro no login !!!");
        return "redirect:/";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String aboutPage(ModelMap model) {
        return "aboutPlayer";
    }

    @RequestMapping(value = "/developer", method = RequestMethod.GET)
    public String developerPage(ModelMap model) {
        return "developerPlayer";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView homePage(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView("homeAdmin");
        return modelAndView;
    }

    @RequestMapping(value = "/homePlayer", method = RequestMethod.GET)
    public String homePagePlayer(ModelMap model, HttpSession session) {

        return "/";
    }
}