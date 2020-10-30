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
		myLinkedList.printMyNodes();

	}

	public INode peak() {
		return myLinkedList.head;

	}

	public boolean isEmpty() {
		return myLinkedList.isEmpty();
	}

	public INode pop() {
		return myLinkedList.pop();
	}
}
