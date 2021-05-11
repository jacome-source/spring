package com.jacome.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jacome.spring.springcore.constructorinjection.Employee;

public class Test {

	public static void main(String[] args) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springcore/propertyplaceholder/property-placeholder-config.xml");
    	MyDAO dao = ctx.getBean(MyDAO.class);
    	System.out.println(dao);
	}
}
