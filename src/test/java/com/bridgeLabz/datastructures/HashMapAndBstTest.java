package com.bridgeLabz.datastructures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
	
	@Test
	public void givenALinkedHashMapGivesCorrectFrequencyShouldPassHashMapTest() {
		String sentance = "Paranoids are not paranoid because they're paranoid but because they keep putting themselves deliberately into paranoid situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String[] k = sentance.toLowerCase().split(" ");
		for (String words : k) {
			Integer value = myLinkedHashMap.get(words);
			if (value == null) {
				value = 1;
			} else {
				value = value + 1;
			}
			myLinkedHashMap.add(words, value);
		}
		assertEquals(3, (int) myLinkedHashMap.get("paranoid"));
	}
	
	@Test
	public void givenALinkedHashMapWhenReturnsNullForRemovedKeyShouldPassHashMapTest() {
		String sentance = "Paranoids are not paranoid because they're paranoid but because they keep putting themselves deliberately into paranoid situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String[] k = sentance.toLowerCase().split(" ");
		for (String words : k) {
			Integer value = myLinkedHashMap.get(words);
			if (value == null) {
				value = 1;
			} else {
				value = value + 1;
			}
			myLinkedHashMap.add(words, value);
		}
		myLinkedHashMap.remove("paranoid");
		boolean result = myLinkedHashMap.get("paranoid") == null;
		assertTrue(result);
	}
}

	
	