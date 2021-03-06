package com.jacome.spring.springcoreadvanced.autowiring.annotation;

public class Address {

	private int number;
	private String street;
	private String city;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [number=" + number + ", street=" + street + ", city=" + city + "]";
	}
	
}
