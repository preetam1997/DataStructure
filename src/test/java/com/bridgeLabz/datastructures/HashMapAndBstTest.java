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

	@Test
	public void given3NumbersWhenLinkedinBinarySearchTreeFashionShouldPassBSTTest() {
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		bst.head = bst.insert(56, bst.head);
		bst.head = bst.insert(30, bst.head);
		bst.head = bst.insert(70, bst.head);
		boolean result = bst.head.getKey() == 56 && bst.head.getLeftChild().getKey() == 30
				&& bst.head.getRightChild().getKey() == 70;
		assertTrue(result);
	}

	@Test
	public void givenFewNumbersCreatingABinarySearchTreeShouldPassBSTTest() {
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		int[] keys = { 56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67 };
		for (int key : keys) {
			bst.head = bst.insert(key, bst.head);
		}
		assertEquals(5, (int) bst.depth(bst.head));
	}

	@Test
	public void givenABinarySearchTreeSearchingTheCorrectNodeShouldPassBSTTest() {
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		int[] keys = { 56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67 };

		for (int key : keys) {
			bst.head = bst.insert(key, bst.head);
		}
		assertEquals(63, (int) bst.search(63, bst.head).getKey());
	}
}
