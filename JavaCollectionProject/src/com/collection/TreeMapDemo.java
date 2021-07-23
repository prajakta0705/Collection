package com.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Double> data=new TreeMap<>();
		data.put(45,78.90);
		data.put(33,74.67);
		data.put(89,90.00);
		data.put(12,45.78);
		
		
		Set<Integer> name=data.keySet();
		for(Integer n:name)
		{
			System.out.println(n+" : "+data.get(n));
		}
		
	}

}
