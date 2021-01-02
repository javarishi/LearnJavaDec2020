package com.h2kinfosys.day06;

import java.util.List;

public class Customer extends GenericCustomer{

	public final String companyName = "Rite Aid";
	
	public Customer(String custId) {
		System.out.println("Customer Constructor " + custId);
		// companyName = "Walgreens";
	}
	
	public Customer(String name, String custId) {
		System.out.println("Customer Constructor " + custId);
		this.name = name;
	}
	
	protected String name;
	protected String address;
	
	protected List<String> validateAddress(String zipCode) {
		boolean validity = false;
		if(zipCode != null && zipCode.length() > 0) {
			validity = true;
		}
		return null;
	}

	@Override
	public void createCustomer(String firstName, String lastName, String address) {
		// TODO Auto-generated method stub
		
	}
}
