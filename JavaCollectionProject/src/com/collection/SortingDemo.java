package com.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class SortingDemo {

	public static void main(String args[]) throws NumberFormatException, IOException
	{
		List<Integer> values=new ArrayList<>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter how many objects that you want to store");
		int n=Integer.parseInt(br.readLine());
		
		System.out.println("enter objects");
		for(int c=0; c<n; c++)
		{
			int temp=Integer.parseInt(br.readLine());
			Integer iob=new Integer(temp);
			values.add(iob);
		}
		
		//sortinng in ascending order
		System.out.println("Sorting in ascending order");
		Collections.sort(values);
		display(values);
		
		//sorting in descending order
		System.out.println("Sorting in descending order");
		Collections.reverse(values);
		display(values);
	}
	static void display(List<Integer> values)
	{
		for(Integer v:values)
		{
			System.out.println(v);
		}
	}

}
