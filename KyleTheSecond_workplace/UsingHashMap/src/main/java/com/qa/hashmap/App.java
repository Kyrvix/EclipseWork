package com.qa.hashmap;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		HashMap<Integer, String> asciiLookup = new HashMap<Integer, String>();
		asciiLookup.put(97, "a");
		asciiLookup.put(98, "b");
		asciiLookup.put(99, "c");
		asciiLookup.put(100, "d");
		asciiLookup.put(101, "e");
		System.out.println(asciiLookup.get(98) + asciiLookup.get(97) + asciiLookup.get(100));
	}
}
