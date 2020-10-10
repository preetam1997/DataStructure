package com.bridgeLabz.datastructures;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DataStructureTest {

	public void welcomeMessage() {
		System.out.println("Welcome To Data Structure");
	}

	@Test
	public void given3NumbersWhenLinkedShouldPassLinkedListTest() {
		MyNode myFirstNode = new MyNode<Integer>(56);
		MyNode mySecondNode = new MyNode<Integer>(30);
		MyNode myThirdNode = new MyNode<Integer>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		assertTrue(result);

	}
}
