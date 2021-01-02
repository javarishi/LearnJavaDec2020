package com.h2kinfosys.day07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	
	public static void main(String[] args) {
		ArrayList<String> sampleList = new ArrayList<String>();
		sampleList.add("Apple");
		sampleList.add("Milk");
		sampleList.add("Toothpaste");
		sampleList.add("Coke");
		System.out.println("ArrayList<String> :: " + sampleList);
		sampleList.add("Apple");
		System.out.println("ArrayList<String> :: " + sampleList);
		// Access with index
		System.out.println("sampleList.get(0) : " + sampleList.get(1));
		sampleList.add(0, "Banana");
		System.out.println("ArrayList<String> :: " + sampleList);
		System.out.println("Index Of " + sampleList.indexOf("Apple"));
		System.out.println("lastIndexOf Of " + sampleList.lastIndexOf("Apple"));
		
		List<String> subList = sampleList.subList(1, 4);
		System.out.println("subList :: " + subList);
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Apple");
		linkedList.add("Milk");
		linkedList.add("Toothpaste");
		linkedList.add("Coke");
		System.out.println("LinkedList<String>  :: " + linkedList);
	}
}
