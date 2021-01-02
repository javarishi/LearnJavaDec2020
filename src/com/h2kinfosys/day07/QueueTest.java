package com.h2kinfosys.day07;

import java.util.PriorityQueue;

public class QueueTest {

	
	public static void main(String[] args) {
		PriorityQueue<String> queueOne = new PriorityQueue<String>();
		PriorityQueue<String> emptyQue = new PriorityQueue<String>();
		// Orders the element in natural-order
		queueOne.offer("Potato");
		queueOne.offer("Leafy Veggies");
		queueOne.offer("Pineapple");
		queueOne.offer("Apple");
		queueOne.add("Tomatos");
		System.out.println(queueOne);
		System.out.println("queueOne element() " + queueOne.element());
	//	System.out.println("emptyQue element() " + emptyQue.element());
		System.out.println("queueOne peek() " + queueOne.peek());
		System.out.println("emptyQue peek() " + emptyQue.peek());
		System.out.println("queueOne poll() " + queueOne.poll());
		System.out.println("emptyQue poll() " + emptyQue.poll());
		System.out.println(queueOne);
		System.out.println("queueOne remove() " + queueOne.remove());
		System.out.println("emptyQue remove() " + emptyQue.remove());
		System.out.println(queueOne);
		
		
	}
}
