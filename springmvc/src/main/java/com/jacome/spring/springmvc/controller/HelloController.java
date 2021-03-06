package com.jacome.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// Informa que a classe processa requisição HTTP
@Controller
public class HelloController {

	// Indica requisição que invoca controller
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		// Indica jsp destino tratada pelo viewResolver
		modelAndView.setViewName("hello");
		
		modelAndView.addObject("id",123);
		modelAndView.addObject("name","Diego");
		modelAndView.addObject("salary",1000);
		return modelAndView;
	}
}
