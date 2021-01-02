package com.h2kinfosys.day04;

public class ArrayIntroduction {

	public static void main(String[] args) {
		// Define - use - Arrays
		int phy = 90;
		int chem = 90;
		int maths = 98;
		
		int[] marks = {90,90,98,82,91};
		System.out.println(marks[0]);
		System.out.println(marks[3]);
		int sizeOfArray = marks.length;
		System.out.println("Size of Array " + sizeOfArray);
		int max_index = sizeOfArray - 1;
		
		int total_marks = 0;
		for(int index = 0; index <= max_index; index++ ) {
			total_marks = total_marks + marks[index];
		}
		System.out.println("Total Marks out of 500 " + total_marks);
		
		int total = 0;
		// Applicable for Arrays and Collections
		/*
		 * for (DataType eachVal : ArrayOrCollection){
		 * 	block of code
		 * }
		 * 
		 */
		for(int eachSub : marks) {
			total = total + eachSub;
		}
		System.out.println("Total Marks with Advance For Loop " + total);
		
		
	}

}
