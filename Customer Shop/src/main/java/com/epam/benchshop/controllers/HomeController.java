package com.epam.benchshop.controllers;

import java.io.IOException;



import com.epam.benchshop.domain.message.MessageSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@Controller
class HomeController {

	@Autowired
	MessageSupplier supplier;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		ModelAndView home = new ModelAndView("home");
		home.getModelMap().addAttribute("message", supplier.getMessage());
		return home;
	}
}
