package com.jacome.spring.springmvcorm.user.service;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacome.spring.springmvcorm.user.dao.UserDao;
import com.jacome.spring.springmvcorm.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Override
	@Transactional
	public int save(User user) {
		return dao.create(user);
	}

	@Override
	public List<User> findUsers() {
		 List<User> result = dao.findAll();
		 Collections.sort(result);
		 return result;
	}

	@Override
	public User getUser(Integer id) {
		return dao.findUser(id);
	}
	
}
