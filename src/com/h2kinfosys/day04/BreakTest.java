package com.h2kinfosys.day04;

public class BreakTest {

	public static void main(String[] args) {
		BreakTest test = new BreakTest();
		// test.breakSeries(10, 6);
		// test.continueSeries(10, 6);
		test.nestedLoop(3, 10);

	}
	
	// Printing N numbers and breaking at b
	public void breakSeries(int n, int b) {
		for(int i = 0; i <= n; i++) {
			if(i == b) {
				break; // breaks the loop, jumps out
			}
			System.out.println("Value of i " + i);
		}
		
	}
	
	
	public void continueSeries(int n, int b) {
		for(int i = 0; i <= n; i++) {
			if(i == b) {
				continue; // skip current iteration and jump to next
			}
			System.out.println("Value of i " + i);
		}
		
	}
	
	
	public void nestedLoop(int n, int m) {
		for(int i=0; i <= n; i++) {
			for(int j=0; j <= m; j++) {
				System.out.println("Value of i " + i + " Value of j " + j);
			}
			System.out.println("One Iteration of I is complete");
		}
	}
	
}
