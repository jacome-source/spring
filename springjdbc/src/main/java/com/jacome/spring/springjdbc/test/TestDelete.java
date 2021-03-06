package com.jacome.spring.springjdbc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jacome.spring.springjdbc.employee.dao.EmployeeDao;

public class TestDelete {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springjdbc/conf/config.xml");
		
    	EmployeeDao dao = (EmployeeDao) ctx.getBean("employeeDao");
    	int result = dao.delete(3);
    	System.out.println("Numbers of records deleted: "+result);
	}
}
