package com.h2kinfosys.day07;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> customerMap = new HashMap<Integer, String>();
		customerMap.put(1234, "Niel Armstrong");
		customerMap.put(1235, "Buzz Aldrine");
		customerMap.put(1236, "David Nix");
		customerMap.put(123, "Rishi Nix");
		// earlier entry deleted and replaced by new one
		customerMap.put(1236, "David Burrow");
		System.out.println(customerMap);
		customerMap.remove(1236);
		System.out.println(customerMap);
		
		// Three Views for Map Data
		// 1. All the Keys - which collection? --> 
		Set<Integer> keySet = customerMap.keySet();
		System.out.println(" customerMap.keySet() " + keySet);
		// 2. Collection of values - 
		Collection<String> values = customerMap.values();
		System.out.println(" customerMap.values() " + values);
		// 3. MapEntry --> key=Value
		Set<Entry<Integer, String>> entries  = customerMap.entrySet();
		System.out.println(" customerMap.entrySet() " + entries);
		
		// Iterate 
		for(int eachKey : keySet) {
			System.out.println("Key : " + eachKey + " Value :: " + customerMap.get(eachKey));
		}
		
		if(customerMap.containsKey(1234)) {
			System.out.println("1234 exists");
		}
		
		if(customerMap.containsValue("Niel Armstrong")) {
			System.out.println("Niel Armstrong is Present");
		}
		
		// LinkedHashMap Example - Order of insertion
		LinkedHashMap<Integer, String> linkedHash = new LinkedHashMap<Integer, String>();
		
	}
}
