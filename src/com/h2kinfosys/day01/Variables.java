package com.h2kinfosys.day01;

public class Variables {

	// Variables - 1. Size Of Data 2. Type of Data
	
	// 8 Primitive 
	// Numeric - Natural NUmbers , Decimal Numbers
	// DataType userDefinedName = value (optional);
	byte byteData = 127; // 0
	Byte byteObj = 127;
	
	short shortData = 32000; // 0
	int intData = 999999999; // 0
	long longData = 999999999999L; // 0
	
	// Decimal Numbers
	float floatData = 343.3243f; // 0
	double doubleData = 234324.324324d; // 0
	
	// Character Data - Single Chara in Single Quotes
	char charData = 'R'; // first ASCII charac from UTF8 character set
	
	// boolean - true / false
	boolean boolData = false; 
	
	String strData = null;
	
	// Find all Wrapper Classes for primitive data - HW
	
	public static void main(String[] args) {
		System.out.println("Maximum Byte : " + Byte.MAX_VALUE + " Minimum Byte : " + Byte.MIN_VALUE);
		//TO-DO : Write all Max and Min Values for all Wrapper Classes
	}
	
	
}
