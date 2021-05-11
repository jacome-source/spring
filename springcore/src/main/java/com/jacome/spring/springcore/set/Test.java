package com.jacome.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jacome.spring.springcore.list.Hospital;

public class Test {

	public static void main(String[] args) {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springcore/set/setconfig.xml");
    	CarDealer cd = ctx.getBean(CarDealer.class);
    	System.out.println(cd.getName());
    	System.out.println(cd.getModels());

	}

}
