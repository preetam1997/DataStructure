package com.bridgeLabz.datastructures;

public class MyHashMap<T extends Comparable<T>, V extends Comparable<V>> {
	MyLinkedList<T> myLinkedList;

	public MyHashMap() {
		this.myLinkedList = new MyLinkedList<>();
	}

	public V get(T key) {
		MyMapNode<T, V> myMapNode = (MyMapNode<T, V>) this.myLinkedList.Search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}
	
	public void add(T key, V value) {
		MyMapNode<T, V> myMapNode = (MyMapNode<T, V>) this.myLinkedList.Search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			this.myLinkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}
}
