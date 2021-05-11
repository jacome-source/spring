package com.jacome.spring.springorm.product.dao;

import java.util.List;

import com.jacome.spring.springorm.entity.Product;

public interface ProductDao {
	
	int create(Product product);
	
	void update(Product product);

	void delete(Product prod);
	
	Product findOne(int id);

	List<Product> findAll();

}
