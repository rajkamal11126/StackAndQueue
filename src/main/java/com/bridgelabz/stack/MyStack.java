package com.bridgelabz.stack;

public class MyStack {
	private MyLinkedList myLinkedList;
	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}
	public void push(MyNode<Integer> mySecondNode) {
		myLinkedList.add(mySecondNode);
		
	}
	public void printStack() {
		myLinkedList.printNodes();
		
	}
	public INode peak() {
		return myLinkedList.head;
		
	}
}
