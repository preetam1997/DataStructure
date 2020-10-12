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
		INode<T> current = this.head; // Initialize current
		while (current != null) {
			if (current.getKey().equals(key) )
				return current; // data found
			current = current.getNext();
		}
		return null;

	}

	public void appendSpecific(T key, INode<T> newNode) {
		INode<T> reqdNode = Search(key);
		INode<T> tempNode = null;
		tempNode = reqdNode.getNext();
		reqdNode.setNext(newNode);
		newNode.setNext(tempNode);

	}

	public void deleteSpecific(T key) {
		  // Store head node
        INode<T> temp = this.head, prev = null;
 
        // If head node itself holds the key to be deleted
        if (temp != null && temp.getKey() == key)
        {
        	
            head = temp.getNext(); // Changed head
            return;
        }
 
        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while (temp != null && temp.getKey() != key)
        {
          
        	prev = temp;
            temp = temp.getNext();
        }    
 
        // If key was not present in linked list
        if (temp == null) return;
 
        // Unlink the node from linked list
        prev.setNext(temp.getNext());
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

	public void push(INode<T> newNode) {
		newNode.setNext(this.head);
		this.head = newNode;
	}

	public T peek() {
		return this.head.getKey();
	}

	public void pop() {
		this.head = this.head.getNext();
	}

	public void enqueue(INode<T> newNode) {
		if (this.tail == null) {
			this.head = this.tail = newNode;
			return;
		}
		this.tail.setNext(newNode);
		this.tail = newNode;
	}

	public INode<T> dequeue() {
		if (this.head == null)
			return null;
		INode<T> dequeuedNode = this.head;
		this.head = this.head.getNext();
		if (this.head == null)
			this.tail = null;
		return dequeuedNode;
	}

}
