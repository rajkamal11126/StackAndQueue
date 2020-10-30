package com.bridgelabz.stacktest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.stack.INode;
import com.bridgelabz.stack.MyNode;
import com.bridgelabz.stack.MyStack;

/**
 * given three numbers added in the stack using push operation
 */
public class MyStackTest {
	@Test
	public void given3Numbers_WhenAddedToStack_ShouldHaveLastAddedNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printStack();
		INode peak = myStack.peak();
		Assert.assertEquals(myThirdNode, peak);
	}

	// using pop operation till empty the nodes
	@Test
	public void given3Numbers_WhenPoppedFromStack_ShouldDeleteTillEndedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode pop = null;
		while (!myStack.isEmpty()) {
			pop = myStack.pop();
		}
		Assert.assertEquals(myFirstNode, pop);

	}
}
