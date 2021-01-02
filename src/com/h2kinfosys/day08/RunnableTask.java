package com.h2kinfosys.day08;

public class RunnableTask implements Runnable {
	
	private String threadName;
	private int count;
	
	public RunnableTask(String threadName, int count) {
		this.threadName = threadName;
		this.count = count;
	}

	@Override
	public void run() {
		System.out.println("ThreadTask " + this.count + " Name " + this.threadName 
				+ " By Thread " + Thread.currentThread().getName());
	}

}
