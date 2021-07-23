package com.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map is an interface,the class LinkedHashMap implements Map interface
		Map<Integer,String> students=new LinkedHashMap<>();
		students.put(101,"Marisa");
		students.put(102,"Navin");
		students.put(103,"tina");
		
		Set<Integer> rollno=students.keySet();
		for(Integer i:rollno)
		{
			System.out.println(i +" : "+students.get(i));
		}
	}

}
