package com.jacome.spring.springmvcorm.user.service;

import java.util.List;

import com.jacome.spring.springmvcorm.user.entity.User;

public interface UserService {

	int save(User user);

	List<User> findUsers();
	
	User getUser(Integer id);
	
}
