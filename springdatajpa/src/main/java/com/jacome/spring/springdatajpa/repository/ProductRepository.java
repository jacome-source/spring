package com.jacome.spring.springdatajpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jacome.spring.springdatajpa.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

	List<Product> findByName(String name);
	
	List<Product> findByNameAndPrice(String name, double price);
	
}
