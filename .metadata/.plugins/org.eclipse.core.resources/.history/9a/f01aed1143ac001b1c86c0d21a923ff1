package com.jacome.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Implementa interfaces de init e destroy do ciclo de vida do Spring
 * 
 * @author diego
 *
 */
public class Patient implements InitializingBean , DisposableBean{

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the Setter Method!");
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside AfterPropertiesSet Method!");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside Destroy Method!");		
	}


}
