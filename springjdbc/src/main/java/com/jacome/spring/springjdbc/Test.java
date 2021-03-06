package com.jacome.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jacome/spring/springjdbc/conf/config.xml");
		
		// Testando conexão
    	JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
    	String sql = "insert into employee values (?,?,?)";
    	int result = jdbcTemplate.update(sql, 1, "Diego", "Jacome");
    	System.out.println("Numbers of records inserted: "+result);
	}

}
