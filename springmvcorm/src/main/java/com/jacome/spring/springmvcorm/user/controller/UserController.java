package com.jacome.spring.springmvcorm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jacome.spring.springmvcorm.user.entity.User;
import com.jacome.spring.springmvcorm.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	// Indica requisição que invoca controller
	@RequestMapping("/registrationPage")
	public String showRegistrationPage() {
		// Utilizando ViewName
		return "userReg";
	}
	
	// Indica requisição que invoca controller
	@RequestMapping(value="/registerUser", method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
			service.save(user);
			model.addAttribute("result", "User created with ID: "+user.getId() );
			return "userReg";
	}
	
	// Indica requisição que invoca controller
	@RequestMapping("/getUsers")
	public String getUsers(ModelMap model) {
		List<User> users = service.findUsers();
		model.addAttribute("users", users);
		return "displayUsers";
	}
	
	// ResponseBody informa que é uma chamada ajax e não um redirecionamento de página
	// ResponseBody está anotando o método
	// Serializa/Desserializa objeto
	@RequestMapping("/validateEmail")
	public @ResponseBody String validateEmail(@RequestParam("id")	Integer id) {
		
		User user = service.getUser(id);
		String msg = "";
		if (user!=null) {
			msg = "ID already exists";
		}
		
		// Utilizando ViewName
		return msg;
	}
	
}
