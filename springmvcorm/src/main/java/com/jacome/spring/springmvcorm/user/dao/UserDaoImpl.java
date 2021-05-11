package com.jacome.spring.springmvcorm.user.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.jacome.spring.springmvcorm.user.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public int create(User user) {
		int result = (int) hibernateTemplate.save(user);
		return result;
	}
	
	@Override
	public User findUser(int id) {
		return hibernateTemplate.get(User.class, id);
	}
		
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(User.class);
	}
	
	
}
