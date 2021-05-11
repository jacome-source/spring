package com.jacome.spring.springdatajpa;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jacome.spring.springdatajpa.entity.Product;
import com.jacome.spring.springdatajpa.repository.ProductRepository;



@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	ProductRepository dao;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void saveProject() {
		Product product = new Product();
		product.setName("teste");
		product.setDescription("teste");
		product.setPrice(700);
		dao.save(product);
		
	}
	
	@Test
	void findProject() {
		Product product = dao.findById(1).get();
		System.out.println(product);	
		
		List<Product> products = dao.findByName("teste");
		products.forEach(p -> System.out.println(p));
		
		products = dao.findByNameAndPrice("teste",700);
		products.forEach(p -> System.out.println(p));
	}
}
