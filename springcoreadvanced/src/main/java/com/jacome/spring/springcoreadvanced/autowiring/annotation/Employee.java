package com.jacome.spring.springcoreadvanced.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;



public class Employee {

	// Injeção de Dependência por Campo
	// @Autowired
	public Address address;
		
	// Injeção de Dependência por Construtor
	@Autowired
	public Employee(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}
	
	// Injeção de Dependência por Propriedade
	// @Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}	

}
