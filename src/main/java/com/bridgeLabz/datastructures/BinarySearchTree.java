package com.bridgeLabz.datastructures;

public class BinarySearchTree<T extends Comparable<T>> {

	MyBstNode<T> head;

	public BinarySearchTree() {
		head = null;
	}

	public MyBstNode<T> insert(T key, MyBstNode<T> root) {
		if (root == null) {
			return new MyBstNode<>(key);
		}
		if (key.compareTo(root.getKey()) < 0) {
			root.setLeftChild(insert(key, root.getLeftChild()));
		} else {
			root.setRightChild(insert(key, root.getRightChild()));
		}
		return root;
	}

	
	public static void main(String[] args) {
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		bst.head = bst.insert(56, bst.head);
		bst.head = bst.insert(30, bst.head);
		bst.head = bst.insert(70, bst.head);

		
	}
}
