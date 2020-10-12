package com.bridgeLabz.datastructures;

public class MyBstNode<T> implements INode<T> {
	MyBstNode<T> leftChild;
	T key;
	MyBstNode<T> rightChild;
	
	public MyBstNode(T key){
		this.key = key;
		this.leftChild = null;
		this.rightChild = null;
	}
	@Override
	public T getKey() {
		// TODO Auto-generated method stub
		return key;
	}
	@Override
	public void setKey(T key) {
		// TODO Auto-generated method stub
		this.key = key;
	}
	@Override
	public INode<T> getNext() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setNext(INode<T> next) {
		// TODO Auto-generated method stub
		
	}
	public MyBstNode<T> getLeftChild() {
		// TODO Auto-generated method stub
		return leftChild;
	}
	
	public void setLeftChild(MyBstNode<T> leftChild) {
		// TODO Auto-generated method stub
		this.leftChild = leftChild;
	}
	
	public MyBstNode<T> getRightChild() {
		// TODO Auto-generated method stub
		return rightChild;
	}
	
	public void setRightChild(MyBstNode<T> rightChild) {
		// TODO Auto-generated method stub
		this.rightChild = rightChild;
	}
}
