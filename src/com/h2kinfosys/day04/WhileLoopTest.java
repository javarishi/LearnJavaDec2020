package com.h2kinfosys.day04;

public class WhileLoopTest {

	public static void main(String[] args) {
		// Add the numbers till given positive number input
		int givenNumber = 10;
		
		/*
		 * while (Condition){
		 * 		execute block of code till condition is true
		 * 		condition modifier
		 * }
		 * Out of loop if condition is false
		 */
		int i = 1;
		int total = 0;
		while(i <= givenNumber) {
			total = total + i;
			System.out.println("Value of i " + i);
			i++;
		}
		System.out.println("Total of 1 to " + givenNumber + " is " + total);
		
	}

}
