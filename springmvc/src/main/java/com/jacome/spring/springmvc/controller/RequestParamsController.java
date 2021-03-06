package com.jacome.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamsController {

	// Indica requisição que invoca controller
	// Passando parâmetros na requisição de get
	@RequestMapping("/showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name, 
								 @RequestParam(value="sal",required=false,defaultValue="0") double salary) {
		ModelAndView modelAndView = new ModelAndView();
		// Indica jsp destino tratada pelo viewResolver
		modelAndView.setViewName("userReg");
		
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("salary: "+salary);
		return modelAndView;
	}
}
