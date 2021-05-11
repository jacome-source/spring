package com.jacome.spring.springjdbc.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jacome.spring.springjdbc.employee.dao.EmployeeDao;
import com.jacome.spring.springjdbc.employee.entity.Employee;

public class TestFindAll {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springjdbc/conf/config.xml");
		
    	EmployeeDao dao = (EmployeeDao) ctx.getBean("employeeDao");
    	List<Employee> resutl = dao.findAll();
    	System.out.println(resutl);
	}

}
