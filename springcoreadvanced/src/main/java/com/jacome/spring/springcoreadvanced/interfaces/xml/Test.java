package com.jacome.spring.springcoreadvanced.interfaces.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {

	public static void main(String[] args) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springcoreadvanced/interfaces/xml/interfaces-xml-config.xml");
    	OrderBOImpl order = (OrderBOImpl) ctx.getBean("bo");
    	order.placeOrder();
	}

}
