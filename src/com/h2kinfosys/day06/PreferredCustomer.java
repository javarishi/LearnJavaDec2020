package com.h2kinfosys.day06;

import java.util.ArrayList;

public class PreferredCustomer extends Customer{
	
	public PreferredCustomer() {
		super("CUST1200", "Rishi");
		System.out.println("PreferredCustomer Constructor");
	}
	
	
	public PreferredCustomer(String custMemNumber) {
		this();
		System.out.println("PreferredCustomer Constructor");
	}
	
	protected String emailAddress = null;
	protected String detailedAddress = null;
	
	public final int additionalDiscount() {
		return 5;
	}
	
	/*
	 * 1. Access Modifier - cannot be restricting than parent
	 * 2. Return type - Co-variant (Class or their Child)
	 * 3. Method name - exactly the same
	 * 4. Parameters - Number should be exactly same, type - co-variant
	 * 5. Method Body - Add your Logic + super.sameMethd()
	 * 6. Exception - co-varient
	 */
	@Override
	public ArrayList<String> validateAddress(String address) {
		System.out.println("Run Google Map for address");
		super.validateAddress(address);
		return null;
	}
	

}
