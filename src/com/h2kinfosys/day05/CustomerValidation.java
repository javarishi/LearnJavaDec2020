package com.h2kinfosys.day05;

public class CustomerValidation {

	public static void main(String[] args) {
		CustomerValidation validate = new CustomerValidation();
		boolean check = validate.validateAddress(12345);
		if(check) {
			System.out.println("Good Customer");
		}

	}
	
	public boolean validateAddress(int zipCode) {
		String strZipCode = String.valueOf(zipCode);
		boolean valid = false;
		if(strZipCode.length() == 5) {
			System.out.println("Valid Zip Code");
			valid = true;
		}
		return valid;
	}
	
	public boolean validateAddress(int zipCode, String city) {
		String strZipCode = String.valueOf(zipCode);
		boolean valid = false;
		if(strZipCode.length() == 5 && city.length() > 0) {
			System.out.println("Valid Zip Code and City");
			valid = true;
		}
		return valid;
	}
	
	public boolean validateAddress(String city) {
		boolean valid = false;
		if(city.length() > 0) {
			System.out.println("Valid City ");
			valid = true;
		}
		return valid;
	}

	
	
	
}
