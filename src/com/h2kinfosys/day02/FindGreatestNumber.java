package com.h2kinfosys.day02;

public class FindGreatestNumber {

	public static void main(String[] args) {
		int firstvar = 1000;
		int secondVar = 200;
		int thirdVar = 300;
		int forthVar = 400; 
		
		// HW - Find greatest number among 4 numbers - no two numbers are equals
		
		boolean result = firstvar > secondVar;
		
		
		System.out.println("firstvar > secondVar is " + result);
		/*
		 * if (condition) {
		 * 	 block of code when condition is true
		 * }else {
		 * 	 block of code when condition is false
		 * }
		 */
		if(firstvar > secondVar) {
			System.out.println("FirstVar is Greater than SecondVar  " + firstvar );
		}else {
			System.out.println("SecondVar is Greater than FirstVar  " + secondVar );
		}
		
		if((firstvar > secondVar) && (firstvar > thirdVar)) {
			System.out.println("FirstVar is Greatest " + firstvar);
		}else if(secondVar > thirdVar) {
			System.out.println("secondVar is Greatest " + secondVar);	
		}else {
			System.out.println("thirdVar is Greatest " + thirdVar);
		}
		
		
	}

}
