package com.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values=new LinkedList<>();
		values.add(34);
		values.add(87);
		values.add(12);
		
		ListIterator<Integer> i=values.listIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("List is in reverse order");
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
	}

}
