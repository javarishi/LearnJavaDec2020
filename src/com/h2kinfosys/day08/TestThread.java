package com.h2kinfosys.day08;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		// 1. Create instance of Thread class
		// 2. Pass runable to constructor
		ThreadTask task = new ThreadTask();
		Thread threadOne = new Thread(task);
		Thread threadTwo = new Thread(task);
		Thread threadThree = new Thread(task);
		threadThree.setName("threadThree");
		threadThree.setPriority(Thread.MIN_PRIORITY);
	//	threadThree.setDaemon(true);
		threadOne.setName("threadOne");
		threadOne.setPriority(Thread.MAX_PRIORITY);
		threadTwo.setName("threadTwo");
		threadTwo.setPriority(Thread.NORM_PRIORITY);
		
		threadOne.start();
		threadThree.start();
		threadTwo.start();
		threadOne.join();
		threadThree.join();
		threadTwo.join();
		
		System.out.println("Main Method Completes");
	}
}
