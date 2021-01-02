package com.h2kinfosys.day04;

public class DoWhileLoopTest {

	public static void main(String[] args) {
		/*
		 * do{
		 * 		first iteration will not check the condition
		 * 		execute block of code fist
		 * 		condition modifier	
		 * } while(condition)
		 */
		
		int givenNumber  = 10;
		int i = 11;
		int total = 0;
		
		do {
			total = total + i;
			System.out.println("Value of i " + i);
			i++;
		}while(i <= givenNumber);
		System.out.println("Total " + total);
	}

}
