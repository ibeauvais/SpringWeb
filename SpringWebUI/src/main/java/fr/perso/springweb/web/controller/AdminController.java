package fr.perso.springweb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {


    @RequestMapping(value="/admin.do", method = RequestMethod.GET)
    public ModelAndView index() {

        return new ModelAndView("admin/admin");
    }
}
