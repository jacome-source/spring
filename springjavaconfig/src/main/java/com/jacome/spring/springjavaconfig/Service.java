package com.jacome.spring.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {

	@Autowired
	Dao dao;
	
	public void init() {
		System.out.println("Init");
	}
	
	public void destroy() {
		System.out.println("Destroy");
	}
	
	public void save() {
		dao.create();
	}
}
