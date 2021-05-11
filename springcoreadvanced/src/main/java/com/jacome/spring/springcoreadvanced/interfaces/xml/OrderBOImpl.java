package com.jacome.spring.springcoreadvanced.interfaces.xml;

public class OrderBOImpl implements OrderBO {

	private OrderDAO dao;
	
	@Override
	public void placeOrder() {
		System.out.println("Inside Order BO");
		dao.createOrder();
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
