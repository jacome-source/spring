package com.jacome.spring.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConf.class);
		// AnnotationConfigApplicationContext permite método register que pode adicionar várias classes de configuração
//		ctx.register(DaoConf.class);
		
		Service service = ctx.getBean(Service.class);
		service.save();
		
		ctx.close();
	}

}
