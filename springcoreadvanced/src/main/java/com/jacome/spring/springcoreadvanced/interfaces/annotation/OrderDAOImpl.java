package com.jacome.spring.springcoreadvanced.interfaces.annotation;

import org.springframework.stereotype.Component;

@Component("dao1")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAOImpl createOrder()");
	}

}
