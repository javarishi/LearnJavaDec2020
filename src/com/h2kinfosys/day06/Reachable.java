package com.h2kinfosys.day06;

public interface Reachable {

	// Variables - public static final - implict
	String cityName = "Atlanta";
	
	// Methods - public abstract
	boolean validateAddress(String address);
	
	default String validateFirstName(String name) {
		if(name.isBlank()) {
			return "Invalid Name";
		}
		return null;
	}
	
	private String checkMobileNumber(String cellNumber) {
		return null;
	}
}
