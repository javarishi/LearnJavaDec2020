package com.h2kinfosys.day08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestClass {

	private static int NTHREDS = 5;
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		for(int i= 1; i < 20; i++){
			RunnableTask task = new RunnableTask("Thread_"+ i, i);
			executor.execute(task);
			}
		executor.shutdown();
	}

}
