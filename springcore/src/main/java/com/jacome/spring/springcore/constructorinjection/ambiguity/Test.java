package com.jacome.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {

	public static void main(String[] args) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springcore/constructorinjection/ambiguity/constructor-injection-ambiguity-config.xml");
    	Addition addition = ctx.getBean(Addition.class);
    	System.out.println(addition);
	}

}
