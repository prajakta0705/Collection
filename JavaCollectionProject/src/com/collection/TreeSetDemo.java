package com.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Double> percentage=new TreeSet<>();
		percentage.add(78.45);
		percentage.add(35.12);
		percentage.add(90.67);
		percentage.add(56.12);
		
	
		for(Double p:percentage)
		{
			System.out.println(p);
		}
		
	}

}
