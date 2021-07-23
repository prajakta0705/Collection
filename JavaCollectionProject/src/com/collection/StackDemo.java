package com.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stack class follows LIFO rule.
		Stack<Integer> values=new Stack<>();
		//push() method adds values at the top in the stack
		values.push(45);
		values.push(12);
		values.push(49);
		values.push(33);
		values.push(66);
		
		//pop() gives topmost elemenet
		
		System.out.println(values.pop());
		System.out.println("Elements in queue after pop Operation");
		for(Integer i:values)
		{
			System.out.println(i);
		}
	
		System.out.println("peek methods returns topmost element");
		//peek() gives topmost element without removing it
		System.out.println(values.peek());
	}

}
