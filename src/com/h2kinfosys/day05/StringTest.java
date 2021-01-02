package com.h2kinfosys.day05;

public class StringTest {

	String firstName = "Rishi H2KInfosys";
	String lastName = null;
	String address;
	
	public static void main(String[] args) {
		// String variable
		String test1 = "test";
		String test2 = "ABC" + test1;
		
		String text = "This is My First String Detailed Class";
		
		System.out.println(test1);
		System.out.println(test2);
		
		int indexOfFirst = text.indexOf("Rishi");
		System.out.println("Index of First " + indexOfFirst );
		
		String test3 = "TEST";
		
		if(test1.equalsIgnoreCase(test3)) {
			System.out.println("Test 1 is Equals to Test 3");
		}else {
			System.out.println("They are not equal");
		}
		
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i <= 10; i++) {
			buffer.append(" StringBuffer_i_" + i);
		}
		String finalString = buffer.toString();
		System.out.println(finalString);
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i <= 10; i++) {
			builder.append(" StringBuilder_i_" + i);
		}
		finalString = builder.toString();
		System.out.println(finalString);
		
	
		
	}

}
