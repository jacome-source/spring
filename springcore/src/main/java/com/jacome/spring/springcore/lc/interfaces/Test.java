package com.jacome.spring.springcore.lc.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springcore/lc/interfaces/lc-interface-config.xml");
    	Patient patient = ctx.getBean(Patient.class);
    	System.out.println(patient);
    	// Invoca destroy methods
    	((AbstractApplicationContext) ctx).registerShutdownHook();
	}

}
