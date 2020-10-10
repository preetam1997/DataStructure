package com.bridgeLabz.datastructures;

import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

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

	@Test
	public void given3NumbersWhenAddedToALinkedListShouldPassLinkedListTest() {
		MyNode myFirstNode = new MyNode<Integer>(56);
		MyNode mySecondNode = new MyNode<Integer>(30);
		MyNode myThirdNode = new MyNode<Integer>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);

		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		assertTrue(result);
	}
	
	@Test
	public void given3NumbersWhenAppendedToALinkedListShouldPassLinkedListTest() {
		MyNode myFirstNode = new MyNode<Integer>(56);
		MyNode mySecondNode = new MyNode<Integer>(30);
		MyNode myThirdNode = new MyNode<Integer>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
		assertTrue(result);
	}
	
	@Test
	public void givenANumbersWhenInsertedBetweenTwoNumbersinLinkedListShouldPassLinkedListTest() {
		MyNode myFirstNode = new MyNode<Integer>(56);
		MyNode mySecondNode = new MyNode<Integer>(30);
		MyNode myThirdNode = new MyNode<Integer>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.addBetween(myFirstNode, mySecondNode);
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
		assertTrue(result);
	}
	
}
