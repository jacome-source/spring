package com.jacome.spring.springcoreadvanced.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {

	public static void main(String[] args) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springcoreadvanced/stereotype/stereotype-config.xml");
    	// Por padrão, nome do bean é igual ao da classe
    	Instructor instructor = (Instructor) ctx.getBean("inst");
//    	Instructor instructor = ctx.getBean(Instructor.class);
    	System.out.println(instructor);
	}

}
