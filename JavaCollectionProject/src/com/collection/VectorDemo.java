package com.collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> values=new Vector<>();
		values.add(67);
		values.add(23);
		values.add(89);
		values.add(56);
		
		Iterator<Integer> i=values.iterator();
		while(i.hasNext())
		{
		System.out.print(i.next() +"\t");
		}
		System.out.println("\n"+"Size of vector is="+values.size());
		//intial capacity of vector is 10.(default)
		System.out.println("Initial capacity is="+ values.capacity());
		
		//capacity increases by 100%
		values.add(67);
		values.add(23);
		values.add(89);
		values.add(56);
		values.add(67);
		values.add(23);
		values.add(89);
		values.add(56);
		
		System.out.println("Second capacity is="+ values.capacity());
	}
}
