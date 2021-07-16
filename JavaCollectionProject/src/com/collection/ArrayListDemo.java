package com.collection;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//To store the elements use collection interface
		Collection<Integer> values = new ArrayList<Integer>();
	
		//Add values in the collection
		values.add(56);
		values.add(34);
		values.add(89);
		
		System.out.println("collecion values using enhance forloop");
		//print the values of collection using enhance forloop.
		for(Integer i:values)
		{
			System.out.print(i +"\t");
		}
		
		System.out.println("\n"+"collection values using iterator");
		//print the values of colection using iterator interface
		Iterator ir=values.iterator();
		while(ir.hasNext())
		{
			System.out.print(ir.next() +"\t");
			
		}
	}


}
