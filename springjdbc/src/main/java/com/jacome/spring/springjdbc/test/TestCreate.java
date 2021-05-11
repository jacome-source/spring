package com.jacome.spring.springjdbc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jacome.spring.springjdbc.employee.dao.EmployeeDao;
import com.jacome.spring.springjdbc.employee.entity.Employee;

public class TestCreate {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springjdbc/conf/config.xml");
		
    	EmployeeDao dao = (EmployeeDao) ctx.getBean("employeeDao");
    	Employee empl = new Employee(3, "Teste", "Teste");
    	int result = dao.create(empl);
    	System.out.println("Numbers of records inserted: "+result);
	}

}
