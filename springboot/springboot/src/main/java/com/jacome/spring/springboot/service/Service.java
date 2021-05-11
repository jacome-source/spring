package com.jacome.spring.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jacome.spring.springboot.dao.Dao;

@Component
public class Service {

	private Dao dao;

	@Autowired
	public Service(Dao dao) {
		System.out.println("Service Bean Created");
		this.dao = dao;
	}
	
	public void save() {
		dao.create();
	}

}
