package com.jacome.spring.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	// Acesso: http://localhost:8080/hello?name=Jacome
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(@RequestParam String name) {
		return "hello "+name;
	}
	
}
