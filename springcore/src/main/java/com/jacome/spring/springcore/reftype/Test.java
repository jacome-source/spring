package com.jacome.spring.springcore.reftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {

	public static void main(String[] args) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springcore/reftype/refconfig.xml");
    	Student student = ctx.getBean(Student.class);
    	System.out.println(student);
	}

}
