package com.jacome.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springcore/map/mapconfig.xml");
    	Customer c = ctx.getBean(Customer.class);
    	System.out.println(c);

	}

	
}
