package com.h2kinfosys.day03;

public class EmployeeTO {

	// Instance Variable
	private String empName;
	private int empId;
	private String officeAddress = "Paces Ferry Rd, Atlanta 33639";
	// static variable
	public static String companyName = "Best Buy Inc.";
	
	/*
	 * 1. Access Modifier - public, private, protected
	 * 2. Return type - output - void - String, Integer, Employee Object
	 * 3. MethodName - logical methods
	 * 4. Parameters / Inputs - () - as many parameters you want, comma separated
	 * 5. Method Body - {}
	 * 6. Exception - Learn this next week
	 * 
	 */
	public boolean validateAddress(String address) {
		boolean validAddress = false;
		// Instance methods - have access to all member variables
		if(address != null && address.length() > 0) {
			// google maps algorithm to validate address 
			validAddress = true;
		}
		return validAddress;
	}
	
	public static String stringValidator(String tobeValidated) {
			System.out.println(companyName);
			if(tobeValidated != null && tobeValidated.length() > 0) {
				return "String is Valid";
			}
			return "String is not valid";
	}
	
	
	public static void main(String[] args) {
		// Creating instance or Object 
		// ClassName instanceName = new CLassName();
		EmployeeTO empOne = new EmployeeTO();
		// Object accesses its members with .
		empOne.empId = 100;
		empOne.empName = "Rishi";
		System.out.println(empOne.empId + " " + empOne.empName + " " + empOne.officeAddress);
		EmployeeTO.companyName = "BestBuy.com";
		System.out.println(EmployeeTO.companyName);
		System.out.println(empOne.validateAddress("Some Address"));
		EmployeeTO.stringValidator("Something");
		
		EmployeeTO empTwo = new EmployeeTO();
		empTwo.officeAddress = "Treehouse Road, Macon";
		System.out.println(empTwo.empId + " " + empTwo.empName + " " + empTwo.officeAddress);
		System.out.println(empOne.validateAddress(null));
		
	}
}
