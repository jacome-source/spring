package com.jacome.spring.springorm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jacome.spring.springorm.entity.Product;
import com.jacome.spring.springorm.product.dao.ProductDao;

public class TestCreate {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springorm/conf/config.xml");
		
    	ProductDao dao = (ProductDao) ctx.getBean("productDao");
    	Product prod = new Product(49, "Teste", "Teste", 100);
    	int result = dao.create(prod);
    	System.out.println("ID inserted: "+result);
	}

}
