package com.bridgelabz.stacktest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.stack.INode;
import com.bridgelabz.stack.MyNode;
import com.bridgelabz.stack.MyStack;

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
}
