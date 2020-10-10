package com.bridgeLabz.datastructures;

public class MyLinkedList<T> {
	public INode<T> head = null;
	public INode<T> tail = null;
	
	public MyLinkedList(){
		
	}
	public void add(INode<T> newNode) {
		
		if(this.head==null) {
			this.head = newNode;
			}
		if(this.tail == null) {
			this.tail =newNode;
		}
		else {
			INode<T> tempNode = null;
			tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
		
	}
	
	public void append(INode<T> newNode) {
		
		if(this.head==null) {
			this.head = newNode;
			}
		if(this.tail == null) {
			this.tail =newNode;
		}
		else {
			INode<T> tempNode = null;
			tempNode = this.tail;
			this.tail = newNode;
			this.head.setNext(tempNode);
		}
		
	}
	
	public void addBetween(INode<T> firstNode,INode<T> newNode) {
		INode<T> tempNode = null;
		INode<T> reqdNode = this.head;
		while(reqdNode != firstNode) {
			reqdNode = reqdNode.getNext();
		}
		tempNode = reqdNode.getNext();
		reqdNode.setNext(newNode);
		reqdNode.getNext().setNext(tempNode);
	}
}
