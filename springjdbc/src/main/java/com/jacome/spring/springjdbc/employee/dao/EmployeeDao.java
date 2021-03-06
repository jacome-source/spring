package com.jacome.spring.springjdbc.employee.dao;

import java.util.List;

import com.jacome.spring.springjdbc.employee.entity.Employee;

public interface EmployeeDao {

	int create(Employee employee);
	
	int update(Employee employee);
	
	int delete(int id);
	
	Employee find(int id);
	
	List<Employee> findAll();
}
