package com.jacome.spring.springcoreadvanced.interfaces.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {

	public static void main(String[] args) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springcoreadvanced/interfaces/annotation/interfaces-annotation-config.xml");
    	OrderBOImpl order = (OrderBOImpl) ctx.getBean("bo");
    	order.placeOrder();
	}

}
