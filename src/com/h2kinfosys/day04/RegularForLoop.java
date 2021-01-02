package com.h2kinfosys.day04;

public class RegularForLoop {

	public static void main(String[] args) {
		/*
		 * for(initializer, condition, increment){
		 * 		block of code
		 * }
		 */
		int givenNumber = 10;
		int total = 0;
		for(int i = 1; i <= givenNumber; i++) {
			total = total + i;
			System.out.println("Value of i " + i);
		}
		System.out.println("total " + total);

	}

}
