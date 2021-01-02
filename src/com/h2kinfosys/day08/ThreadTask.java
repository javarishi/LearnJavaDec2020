package com.h2kinfosys.day08;

public class ThreadTask implements Runnable{
	
	private int uid = 10010;

	@Override
	public void run() {
		System.out.println("Printing 10 numbers " + Thread.currentThread().getName());
		for(int i =1; i <=10; i++) {
			System.out.println("Value of i " + i + " By " + Thread.currentThread().getName());
			uniqueIdGenerator();
			/*
			 * try { Thread.sleep(100); Thread.yield(); } catch (InterruptedException e) {
			 * e.printStackTrace(); }
			 */
		}
		
	}

	
	public int uniqueIdGenerator() {
		System.out.println("Earlier Value of UID " + this.uid);
		synchronized (this) {
			uid++;
		}
		System.out.println("New Value of UID " + this.uid);
		return uid;
	}
	
	
}
