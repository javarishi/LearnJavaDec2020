package com.h2kinfosys.day12;

public class TestLocalClass {

	private String instanceVariable= "Instance Variable";
	private static String staticVariable= "Static Variable";
	
	public static void main(String[] args) {
		
	}

	
	public void validateCustomer(String filePath) {
		// CLasses Declared within Method - Local CLasses
		class ReadCustomerData{
			private String testPrivate = "Something";
			
			void readFile(String fPath) {
				if(fPath == null) {
					fPath = filePath;
				}
				System.out.println("Member Method for Local Class " + testPrivate);
				System.out.println("INstance Variable of Main CLass :: " + instanceVariable);
				System.out.println("Static Variable of Main CLass :: " + staticVariable);
			}
		}
	
		ReadCustomerData cust = new ReadCustomerData();
		cust.readFile(null);
		
		
	}
}
