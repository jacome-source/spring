package com.jacome.spring.springorm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jacome.spring.springorm.entity.Product;
import com.jacome.spring.springorm.product.dao.ProductDao;

public class TestDelete {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springorm/conf/config.xml");
		
    	ProductDao dao = (ProductDao) ctx.getBean("productDao");
    	Product prod = new Product(49, "Teste", "Teste", 1000);
    	dao.delete(prod);
	}
}
