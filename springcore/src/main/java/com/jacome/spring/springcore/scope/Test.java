package com.jacome.spring.springcore.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {

	public static void main(String[] args) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springcore/scope/scope-config.xml");
    	Student student1 = (Student) ctx.getBean("student");
    	System.out.println(student1.hashCode());
    	
    	// Teste de escopo prototype
    	// Sempre uma nova instância do bean
    	Student student2 = (Student) ctx.getBean("student");
    	System.out.println(student2.hashCode());
	}

}
