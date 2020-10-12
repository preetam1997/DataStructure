package com.bridgeLabz.datastructures;

public class MyMapNode<T,V> implements INode<T> {
	T key;
	V value;
	MyMapNode<T, V> next;
	
	public MyMapNode(T key,V value) {
		this.key = key;
		this.value = value;
		this.next = null;
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

	@SuppressWarnings("unchecked")
	@Override
	public void setNext(INode<T> next) {
		this.next = (MyMapNode<T, V>) next;
		
	}
	
	public V getValue() {
		return value;
	}

	
	public void setValue(V value) {
		// TODO Auto-generated method stub
		this.value = value;
	}
	
	
}
