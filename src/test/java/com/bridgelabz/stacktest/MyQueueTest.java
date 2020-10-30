package com.bridgelabz.stacktest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.stack.INode;
import com.bridgelabz.stack.MyNode;
import com.bridgelabz.stack.MyStack;

public class MyQueueTest {
	//method to added three elements in queue
	@Test
	public void givenValues_WhenAddedToQueue_ShouldHaveFirstAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);	
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode =  new MyNode<>(70);
		MyStack myQueue = new MyStack();
		myQueue.enqueu(myFirstNode);
		myQueue.enqueu(mySecondNode);
		myQueue.enqueu(myThirdNode);
		myQueue.printStack();
		INode peak = myQueue.peak();
		Assert.assertEquals(myFirstNode, peak);
	}
	
}
