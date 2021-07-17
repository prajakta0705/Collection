package com.collection;

import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Collection;

import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
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
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\n \n enter object=");
		int result=Integer.parseInt(br.readLine());

		boolean b=values.contains(result);
		if(b==true)
			System.out.println("\n"+ result + " is present");
		else
			System.out.println(result + " is not present");
		}
	


}
