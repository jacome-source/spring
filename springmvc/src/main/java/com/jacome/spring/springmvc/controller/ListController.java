package com.jacome.spring.springmvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jacome.spring.springmvc.entity.Employee;

@Controller
public class ListController {

	// Indica requisição que invoca controller
	@RequestMapping("/displayList")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		// Indica jsp destino tratada pelo viewResolver
		modelAndView.setViewName("displayList");
		
		Employee empl1 = new Employee(123, "Diego", 1000);
		Employee empl2 = new Employee(456, "Dalva", 500);
		Employee empl3 = new Employee(789, "Teste", 700);
		List<Employee> list = List.of(empl1, empl2, empl3);
		modelAndView.addObject("employees", list);
		return modelAndView;
	}
}
