package com.jacome.spring.springorm.product.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.jacome.spring.springorm.entity.Product;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {

	HibernateTemplate hibernateTemplate;	
	
	@Override
	@Transactional
	public int create(Product product) {
		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
	}

	@Override
	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
	}
	
	@Override
	@Transactional
	public void delete(Product prod) {
		hibernateTemplate.delete(prod);		
	}
	
	@Override
	public Product findOne(int id) {
		return hibernateTemplate.get(Product.class, id);
	}
		
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Product.class);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Autowired
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}	
}
