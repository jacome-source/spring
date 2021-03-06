package com.jacome.spring.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.jacome.spring.springboot.service.Service;

@SpringBootTest
class SpringbootApplicationTests {

	@Autowired
	ApplicationContext ctx;
	
	@Test
	void contextLoads() {
		
	}
	
	@Test
	void testService() {
		Service service = ctx.getBean(Service.class);
		service.save();
	}

}
