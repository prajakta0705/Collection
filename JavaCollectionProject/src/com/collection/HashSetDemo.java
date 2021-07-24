package com.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set is an interface in Collection.The class HashSet implements Set.Set doesn't contain duplicate element
		Set<Integer> values=new HashSet<>();
		//add() method add the element in the collection but as we are implement Set interface in HashSet class.It uses Hashing Concept.that's why it doesn't maintain insertion order.
		values.add(45);
		values.add(78);
		values.add(23);
		values.add(14);
		values.add(90);
		values.add(78);
		for(Integer i:values)
		{
			System.out.println(i);
		}
		System.out.println("Size ="+ values.size());
		
	}
}
