package com.jacome.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jacome.spring.springmvc.entity.Employee;

@Controller
public class ObjectController {

	// Indica requisição que invoca controller
	@RequestMapping("/displayObject")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		// Indica jsp destino tratada pelo viewResolver
		modelAndView.setViewName("displayObject");
		
		Employee empl = new Employee(123, "Diego", 1000);
		modelAndView.addObject("empl", empl);
		return modelAndView;
	}
}
