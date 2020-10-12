package com.bridgeLabz.datastructures;

import java.util.ArrayList;

public class MyLinkedHashMap<T extends Comparable<T>, V extends Comparable<V>> {
	private final int numBuckets;
	ArrayList<MyLinkedList<T>> myBucketArray;

	public MyLinkedHashMap() {
		this.numBuckets = 10;
		this.myBucketArray = new ArrayList<>(numBuckets);
		for (int i = 0; i < numBuckets; i++) {
			this.myBucketArray.add(null);
		}
	}

	private int getBucketIndex(T key) {
		int hashCode = (Math.abs(key.hashCode()));
		int index = hashCode % numBuckets;
		return index;
	}

	@SuppressWarnings("unchecked")
	public V get(T key) {
		int index = this.getBucketIndex(key);
		MyLinkedList<T> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null)
			return null;
		MyMapNode<T, V> myMapNode = (MyMapNode<T, V>) myLinkedList.Search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	@SuppressWarnings("unchecked")
	public void add(T key, V value) {
		int index = this.getBucketIndex(key);
		MyLinkedList<T> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null) {
			myLinkedList = new MyLinkedList<>();
			this.myBucketArray.set(index, myLinkedList);

		}
		MyMapNode<T, V> myMapNode = (MyMapNode<T, V>) myLinkedList.Search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			myLinkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	@SuppressWarnings("unchecked")
	public void remove(T key) {
		int index = this.getBucketIndex(key);
		MyLinkedList<T> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null) {
			return;
		}
		MyMapNode<T, V> myMapNode = (MyMapNode<T, V>) myLinkedList.Search(key);

		if (myMapNode == null) {
			return;

		} else {
			myMapNode.setValue(null);
		}
	}
}
