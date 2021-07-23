package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map is an interface which is used to store objects in collection.HashMap is the clas which implements the Map interface
		//Map interface stores values is in key value pair.Keys should be unique.
		Map<String,String> phno=new HashMap<>();
		//put() stores the elements in Map interface.
		phno.put("Prajakta","9527923507");
		phno.put("Nikita","9213456789");
		phno.put("Raj","7821899501");
		phno.put("Manisha","9234567507");
		phno.put("Anu","9695278127");
		
		//method get() return the value of the key
		System.out.println("Raj : "+phno.get("Raj"));
		
		//If you want all values in Map using keys.The method keySet() returns all keys.
		Set<String> key=phno.keySet();
		for(String s:key)
		{
			System.out.println(s+" : "+phno.get(s));
		}
		
		//If key is not present in the map,it will return null value
		System.out.println("The value of key adi is:"+ phno.get("adi"));
	}

}
