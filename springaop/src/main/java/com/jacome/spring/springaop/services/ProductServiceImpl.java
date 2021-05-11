package com.jacome.spring.springaop.services;

public class ProductServiceImpl implements ProductService {

	@Override
	public int multiply(int n1, int n2) {
		int result = n1 * n2;
		System.out.println("Result: "+result);
		return result;
	}

}
