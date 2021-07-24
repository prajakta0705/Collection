/**
 * 
 */
package com.collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * @author Prajakta
 *
 */
public class HashTableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> tab=new Hashtable<>();
		tab.put(1, "ramya");
		tab.put(2,"hritik");
		tab.put(3,"Advika");
		tab.put(5,"latika");
		tab.put(4,"raj");
		
		Set<Integer> number=tab.keySet();
		for(Integer n:number)
		{
			System.out.println(tab.get(n));
		}
		
		
	}

}
