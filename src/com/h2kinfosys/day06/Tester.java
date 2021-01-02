package com.h2kinfosys.day06;

public class Tester {

	public static void main(String[] args) {
	//	Customer cust = new Customer();
	//	cust.validateAddress("30080");
		PreferredCustomer pCust = new PreferredCustomer("Something");
		System.out.println(pCust.additionalDiscount()); // CHild CLass Method
		System.out.println(pCust.validateAddress("30336"));
		
		// ClassName instanceName = new Constructor()
		// ReferenceType instanceName = new InstanceType();
		// Parent instance = new Child()
		Customer custOne = new PreferredCustomer();
		// 1. Visibility of members is defined by Reference Type
		// 2. Execution of members is defined by Instance type
		pCust.additionalDiscount();
		custOne.validateAddress("03459940358");
	}

}
