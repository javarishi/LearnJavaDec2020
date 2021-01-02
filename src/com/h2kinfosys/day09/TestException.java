package com.h2kinfosys.day09;

public class TestException {

	
	public static void main(String[] args) {
		int valueOne = 100;
		int valueTwo = 10;
		String name = "Rishi";
		int[] simpleArray = {1,2,3,4,5};
		TestException test = new TestException();
		// try catch block
		/*
		 * try {
		 * 		risky code which might throw exception
		 * 		File Open
		 * 		File Read - you might get an exception
		 * }catch(TypeOfExpception ex){
		 * 		Alternate Logic when exception occurs
		 * }finally{
		 * 		File Close
		 * }
		 * Any number of catch blocks can be added
		 * try either needs a catch or needs a Finally
		 */
		try {
			System.out.println("Division " + (valueOne / valueTwo));
			System.out.println(name.length());
			System.out.println(simpleArray[1]);
		}catch(ArithmeticException aex) {
			System.out.println("ArithmeticException Occured " + aex.getMessage());
		}catch(NullPointerException nullex) {
			System.out.println("NullPointerException Occured " + nullex.getMessage());
		}catch(Exception ex) {
			
			System.out.println("Unknown Exception Occurs " + ex);
		}finally {
			System.out.println("FINALLY:: This code will execute regardless of exception");
		}
		try {
			test.customerDataValidation("Rishi","-10");
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
		System.out.println("That's the best example for Exception");
		
		
	}
	
	public void customerDataValidation(String name, String age) throws InvalidAgeException {
		int intAge = Integer.parseInt(age);
		this.validateAge(intAge);
	}
	
	
	public boolean validateAge(int age) throws InvalidAgeException{
		boolean flag = false;
		if(age > 0 && age >= 18) {
			System.out.println("Allow Alcohol Purchase");
			flag = true;
		}else {
			System.out.println("Invalid Age");
			// throw an exception
			throw new InvalidAgeException("Invalid Age for Alcohol Purchase");
		}
		return flag;
	}
	
	
}
