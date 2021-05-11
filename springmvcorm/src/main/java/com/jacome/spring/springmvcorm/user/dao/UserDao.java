package com.jacome.spring.springmvcorm.user.dao;

import java.util.List;

import com.jacome.spring.springmvcorm.user.entity.User;

public interface UserDao {

	int create(User user);

	User findUser(int id);

	List<User> findAll();

	
}
