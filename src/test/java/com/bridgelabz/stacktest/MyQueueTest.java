package com.bridgelabz.stacktest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.stack.INode;
import com.bridgelabz.stack.MyNode;
import com.bridgelabz.stack.MyStack;

public class MyQueueTest {
	// UC-3 method to added three elements in queue
	@Test
	public void given3Elements_WhenAddedToQueue_ShouldHaveFirstAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyStack myQueue = new MyStack();
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		myQueue.printStack();
		INode peak = myQueue.peak();
		Assert.assertEquals(myFirstNode, peak);
	}

	// UC-4 method to added three element in dequeue
	@Test
	public void given3Elements_WhenDeQueue_ShouldHaveFirstAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyStack myQueue = new MyStack();
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		INode dequeue = myQueue.dequeue();
		myQueue.printStack();
		Assert.assertEquals(myFirstNode, dequeue);
	}

}
