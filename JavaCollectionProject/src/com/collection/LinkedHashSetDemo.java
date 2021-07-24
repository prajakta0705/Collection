package com.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> values=new LinkedHashSet<>();
		values.add("Rita");
		values.add("Nihar");
		values.add("Saksham");
		values.add("Nitya");
		values.add("Mira");
		
		for(String s:values)
		{
			System.out.println(s);
		}
	}

}
