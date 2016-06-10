package com.epam.benchshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Mateusz_Finek on 6/10/2016.
 */
@Controller
class SecondPage {

    @RequestMapping(value="/secondPage")
    public ModelAndView test(HttpServletResponse response) throws IOException {
        ModelAndView home = new ModelAndView("secondPage");
        home.getModelMap().addAttribute("message", "text drugiej strony");
        return home;
    }

}
