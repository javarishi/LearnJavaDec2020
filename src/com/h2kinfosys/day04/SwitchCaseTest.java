package com.h2kinfosys.day04;

import java.util.Calendar;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// RealTime Example - Store Open Batch with Switch case
		// Sunday = 1 
		int day_of_week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		System.out.println("Today is " + day_of_week);
		// String, character, int and short, byte - Java 15 - pattern
		switch(day_of_week) {
		
		case 1:
		case 6: {
					System.out.println("PriceLoader runs at 7:00 AM");
					break;
				}
		case 2:
		case 7: {
					System.out.println("PriceLoader runs at 6:30 AM");
					break;
				}
		case 3: {
					System.out.println("PriceLoader runs at 8:00 AM");
					break;
				}
		case 4: 
		case 5:{
					System.out.println("PriceLoader runs at 8:30 AM");
					break;
				}
		default: {
					System.out.println("PriceLoader runs at 8:30 AM");
					break;
				}
				
		}
		System.out.println("Switch Case Complete! Price Loader batch complete");
		
		
	}

}
