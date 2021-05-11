package com.jacome.spring.springcoreadvanced.autowiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {

	public static void main(String[] args) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springcoreadvanced/autowiring/xml/autowiring-xml-config.xml");
    	Employee employee = ctx.getBean(Employee.class);
    	System.out.println(employee);
	}

}
