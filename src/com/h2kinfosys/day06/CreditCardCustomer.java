package com.h2kinfosys.day06;

import java.util.ArrayList;

public class CreditCardCustomer extends PreferredCustomer {


	@Override
	public ArrayList<String> validateAddress(String address) {
		System.out.println("This is Validation with Govt Database");
		return super.validateAddress(address);
	}
	
	/*
	@Override
	public int additionalDiscount() {
		System.out.println("10% Discount");
		return super.additionalDiscount();
	}*/
	
	
	public void publishPromos(String promoString) {
		System.out.println("New Promotion for CC Customer :: " + promoString);
	}
	
}
