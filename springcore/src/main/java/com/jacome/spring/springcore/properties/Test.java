package com.jacome.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springcore/properties/propconfig.xml");
    	Languages langs = ctx.getBean(Languages.class);
    	System.out.println(langs);
	}

}
