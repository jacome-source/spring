package com.jacome.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springcore/list/listconfig.xml");
    	Hospital hospital = ctx.getBean(Hospital.class);
    	System.out.println(hospital.getName());
    	System.out.println(hospital.getDepartments());
	}

}
