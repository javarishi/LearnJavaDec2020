package com.h2kinfosys.day06;

public abstract class GenericCustomer {
	
	String abstractVariables = "It can have Variables";

	public abstract void createCustomer(String firstName, String lastName, String address);
	
	public void nonAbstract() {
		System.out.println("Non Abstract Method");
	}
	
	
}
