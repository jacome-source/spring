package com.jacome.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jacome.spring.springmvc.entity.User;

@Controller
public class UserController {

	// Indica requisição que invoca controller
	@RequestMapping("/registrationPage")
	public String showRegistrationPage() {
		// Utilizando ViewName
		return "userReg";
	}
	
	// Indica requisição que invoca controller
		@RequestMapping(value="/registerUser", method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
			model.addAttribute("user", user);
			System.out.println(user);
			return "regResult";
	}
}