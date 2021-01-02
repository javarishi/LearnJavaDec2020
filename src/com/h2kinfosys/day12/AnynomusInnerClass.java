package com.h2kinfosys.day12;

public class AnynomusInnerClass {

	public static void main(String[] args) {
		AnynomusInnerClass test = new AnynomusInnerClass();
		test.transportTruck("Atlanta");

	}
	
	public void transportTruck(String destination) {
		System.out.println("Going to " + destination);
		MovableItem moveItem = new MovableItem() {
			
			@Override
			public void move(String gpsX, String gpsY) {
				System.out.println("Co-ordinates Set, Lets go");
				
			}
		};
		
		moveItem.move("121.121'121", "3434.34'22");
		
	}

}
