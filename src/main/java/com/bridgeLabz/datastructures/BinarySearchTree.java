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

	public Integer depth(MyBstNode<T> root) {
		if (root == null)
			return 0;
		else {
			int lDepth = depth(root.getLeftChild());
			int rDepth = depth(root.getRightChild());
			if (lDepth > rDepth)
				return (lDepth + 1);
			else
				return (rDepth + 1);
		}
	}
}
