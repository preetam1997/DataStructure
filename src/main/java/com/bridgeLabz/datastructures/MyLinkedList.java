package com.bridgeLabz.datastructures;

public class MyLinkedList<T extends Comparable<T>> {
	public INode<T> head = null;
	public INode<T> tail = null;

	public MyLinkedList() {

	}

	public void add(INode<T> newNode) {

		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			INode<T> tempNode = null;
			tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}

	}

	public void append(INode<T> newNode) {

		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			INode<T> tempNode = this.head;
			while (tempNode.getNext() != null) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(newNode);
			this.tail = newNode;
		}

	}

	public void addBetween(INode<T> firstNode, INode<T> newNode) {
		INode<T> tempNode = null;
		INode<T> reqdNode = this.head;
		while (reqdNode != firstNode) {
			reqdNode = reqdNode.getNext();
		}
		tempNode = reqdNode.getNext();
		reqdNode.setNext(newNode);
		reqdNode.getNext().setNext(tempNode);
	}

	public T popFirst() {
		INode<T> tempNode = this.head;
		head = head.getNext();
		tempNode.setNext(null);

		return tempNode.getKey();

	}

	public void popLast() {
		INode<T> newLastNode = this.head;
		while (newLastNode.getNext() != this.tail) {
			newLastNode = newLastNode.getNext();
		}
		this.tail = newLastNode;
	}

	public INode<T> Search(T key) {
		INode<T> reqdNode = this.head;
		while (reqdNode.getKey() != key) {
			reqdNode = reqdNode.getNext();
		}
		return reqdNode;
	}

	public void appendSpecific(T key, INode<T> newNode) {
		INode<T> reqdNode = Search(key);
		INode<T> tempNode = null;
		tempNode = reqdNode.getNext();
		reqdNode.setNext(newNode);
		newNode.setNext(tempNode);

	}

	public void deleteSpecific(T key) {
		INode<T> reqdNode = this.head;
		INode<T> tempNode = null;
		while (reqdNode.getNext().getKey() != key) {
			reqdNode = reqdNode.getNext();
		}
		tempNode = reqdNode.getNext().getNext();
		reqdNode.getNext().setNext(null);
		reqdNode.setNext(tempNode);
	}

	public int size() {
		int size = 0;
		INode<T> tempNode = this.head;
		while (tempNode != null) {
			tempNode = tempNode.getNext();
			size++;
		}
		return size;
	}

	public void orderedAdd(INode<T> newNode) {
		if (this.head == null || this.head.getKey().compareTo(newNode.getKey()) >= 0) {
			newNode.setNext(this.head);
			this.head = newNode;
			return;
		}
		INode<T> current = this.head;
		while (current.getNext() != null && current.getNext().getKey().compareTo(newNode.getKey()) < 0) {
			current = current.getNext();
		}
		newNode.setNext(current.getNext());
		current.setNext(newNode);
		INode<T> tempNode = this.head;
		while (tempNode.getNext() != null) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
	}

	public void push(INode<T> newNode)
	{
		newNode.setNext(this.head);
		this.head = newNode;
	}

}
