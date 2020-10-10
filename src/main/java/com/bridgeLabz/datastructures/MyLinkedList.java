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
}
