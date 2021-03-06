package com.jacome.spring.springcoreadvanced.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {

	public static void main(String[] args) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springcoreadvanced/standalonecollection/standalone-collection-config.xml");
    	ProductList list = ctx.getBean(ProductList.class);
    	System.out.println(list.getProductList());
	}

}
