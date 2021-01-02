package com.h2kinfosys.day07;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {
	
	public static void main(String[] args) {
		// HashSet - Fastest but order is not guaranteed 
	/*	HashSet<String> testSet = new HashSet<String>();
		testSet.add("Apple");
		testSet.add("Milk");
		testSet.add("Toothpaste");
		testSet.add("Coke"); */
		
		// TreeSet - Sorts the elements with Binary Tree Algorithm
	/*	TreeSet<String> testSet = new TreeSet<String>();
		testSet.add("Apple");
		testSet.add("Milk");
		testSet.add("Toothpaste");
		testSet.add("Coke"); */
		
		
		LinkedHashSet<String> testSet = new LinkedHashSet<String>();
		testSet.add("Apple");
		testSet.add("Milk");
		testSet.add("Toothpaste");
		testSet.add("Coke");
		
		HashSet<String> testSet2 = new HashSet<String>();
		testSet2.add("Potatos");
		testSet2.add("Candy");
		
		System.out.println(" LinkedHashSet<String> :: " + testSet);
		System.out.println("Able to add Apple again :: " + testSet.add("Apple"));
		System.out.println(" LinkedHashSet<String> :: " + testSet);
		
		testSet.remove("Coke");
		System.out.println(testSet);
		
		System.out.println(testSet.size());
		
		if(testSet.contains("Apple")) {
			System.out.println("Apple is present");
		}
		
		
		testSet.addAll(testSet2);
		System.out.println("Add All :: " + testSet);
		
		testSet.retainAll(testSet2);
		System.out.println("retainAll  :: " + testSet);
		
		
		
		for(String eachItem : testSet) {
			System.out.println(eachItem);
		}
		
		testSet.clear();
		System.out.println(testSet.isEmpty());
		
	}

}
