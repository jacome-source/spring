package com.jacome.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConf {

	@Bean
	public Dao dao() {
		return new Dao();
	}
	
}
