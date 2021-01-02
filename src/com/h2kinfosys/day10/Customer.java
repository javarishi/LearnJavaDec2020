package com.h2kinfosys.day10;

import java.io.Serializable;

public class Customer implements Serializable{
	
	public Customer() {
		System.out.println("Customer Created");
	}

	private String name;
	private String address;
	private int custId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	
	
}
