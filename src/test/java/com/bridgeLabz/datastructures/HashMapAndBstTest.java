package com.bridgeLabz.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HashMapAndBstTest {

	@Test
	public void givenAHashMapGivesCorrectFrequencyShouldPassHashMapTest() {
		String sentance = "To be or not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String[] k = sentance.toLowerCase().split(" ");
		for (String words : k) {
			Integer value = myHashMap.get(words);
			if (value == null) {
				value = 1;
			} else {
				value = value + 1;
			}
			myHashMap.add(words, value);
		}
		assertEquals(2, (int) myHashMap.get("to"));
	}
}

	
	
