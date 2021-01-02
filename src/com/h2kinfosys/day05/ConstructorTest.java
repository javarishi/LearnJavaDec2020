package com.h2kinfosys.day05;

public class ConstructorTest {

	/*
	 * Constructor is a Unique Method 
	 * 1. Access Modifier - 
	 * 2. NO Return type
	 * 3. Name - Exactly matches ClassName
	 * 4. Parameters / argument - Allows Arguments
	 * 5. Body - has body
	 * 6. Exception - can throw 
	 * 7. Overload Constructor 
	 */
	
	public ConstructorTest() {
		System.out.println("Constructor Helping Object Creation");
	}
	
	public ConstructorTest(String param) {
		this();
		System.out.println("Overloaded Constructor Helping Object Creation " + param);
	}
	
	public ConstructorTest(int test) {
		this("param");
		System.out.println("Overloaded with another Parameter " + test);
	}
	
	// No Free Constructor if you have one already
	
	public static void main(String[] args) {
		// ClassName instanceName = new Constructor()
		ConstructorTest test1 = new ConstructorTest("test1");
		ConstructorTest test2 = new ConstructorTest("test2");
		/**
		 * Customer class - 3 overloaded const
		 * no-arg
		 * custId
		 * custId, custName
		 * Chain them 
		 */

	}

}
