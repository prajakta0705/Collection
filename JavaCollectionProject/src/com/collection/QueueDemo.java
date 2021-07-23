package com.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue is an interface.The class PriorityQueue class implements Queue interface
		Queue<Integer> values=new PriorityQueue<>();
		//add() method adds element at the end
		values.add(49);
		values.add(78);
		values.add(90);
		values.add(71);
		
		//remove() method removes element at the front
		System.out.println(values.remove());
		System.out.println("After removing the element,Queue will be");
		for(Integer ir: values)
		{
			System.out.println(ir);
		}
		//method peek() returns the element at the front with out removing it
		System.out.println("peek elemnet="+ values.peek());
	}

}
