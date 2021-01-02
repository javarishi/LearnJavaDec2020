package com.h2kinfosys.day02;

public class OperatorsTest {

	public static void main(String[] args) {
		int firstVar = 100;
		int secondVar = 200;
	
		// Mathematical operators
		System.out.println("Addition :: " + (firstVar + secondVar));
		System.out.println("Substraction :: " + (firstVar - secondVar));
		System.out.println("Division :: " + (firstVar / secondVar));
		System.out.println("Multiplication :: " + (firstVar * secondVar));
		System.out.println("Modulus :: " + (firstVar % secondVar));
		
		// increment operator
		// increase by 1
		System.out.println("Use the existing value and increase by 1 " + (firstVar++));
		System.out.println("new Value of FirstVar " + firstVar);
		
		System.out.println("Increase first then use the value " + (++secondVar));
		
		// Comparison operators : < > <= >= != == --> Always generates - boolean
		System.out.println("Less than < :: " + (firstVar < secondVar)); // true
		System.out.println("Greater than > :: " + (firstVar > secondVar)); // false
		System.out.println("Less or Equals  <= :: " + (firstVar <= secondVar)); // true
		System.out.println("Greater or equals  >= :: " + (firstVar >= secondVar)); // false
		System.out.println("Not Equals != :: " + (firstVar != secondVar)); // true
		System.out.println("Equals == :: " + (firstVar == secondVar)); // false
		
		// logical operator - on boolean
		/*
		 * Truth Table - AND - &&
		 * S1	S2		&&
		 * T	T		T
		 * T	F		F
		 * F	T		F
		 * F	F		F
		 */
		
		boolean firstBool = true;
		boolean secondBool = false;
		System.out.println("Testing AND , Result is " + (firstBool && secondBool));
		
		/* Truth Table - OR - ||
		 * S1	S2		||
		 * T	T		T
		 * T	F		T		
		 * F	T		T
		 * F	F		F
		 */
		System.out.println("Testing OR , Result is " + (firstBool || secondBool));
		
		// Not operator
		/*
		 * S1	!
		 * T	F
		 * F	T
		 */
		
		System.out.println("NOT of True is : " + !firstBool);
		System.out.println("NOT of false is : " + !secondBool);
		
	}

}
