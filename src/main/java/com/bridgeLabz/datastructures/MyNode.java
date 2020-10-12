package com.bridgeLabz.datastructures;

public class MyNode<T> implements INode<T>{
	private T key;
	private INode<T> next=null;
	
	public MyNode(T key) {
		this.key = key;
	}

	@Override
	public T getKey() {
		return key;
	}

	@Override
	public void setKey(T key) {
		this.key = key;
		
	}

	@Override
	public INode<T> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<T> next) {
		this.next = next;
		
	}
	
	

}
