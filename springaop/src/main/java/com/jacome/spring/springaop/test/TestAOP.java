package com.jacome.spring.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jacome.spring.springaop.services.ProductService;

public class TestAOP {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springaop/conf/config.xml");
		
    	ProductService service = (ProductService) ctx.getBean("productService");
    	service.multiply(3, 7);
	}
}
