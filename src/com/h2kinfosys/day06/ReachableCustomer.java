package com.h2kinfosys.day06;

public class ReachableCustomer implements Reachable{
	
	public ReachableCustomer() {
		System.out.println(Reachable.cityName);
	}

	@Override
	public boolean validateAddress(String address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String validateFirstName(String name) {
		// TODO Auto-generated method stub
		return Reachable.super.validateFirstName(name);
	}
}
