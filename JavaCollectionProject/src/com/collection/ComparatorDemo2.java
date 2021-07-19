//if you don't want to mension new class for sorting,There is solution to create Annonymous class
package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ComparatorDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values=new ArrayList<Integer>();
		values.add(235);
		values.add(151);
		values.add(988);
		values.add(742);
		
		//sort digit with the help of last digit
		Comparator<Integer> com =new Comparator<Integer>(){
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(o1%10>o2%10)
					return 1;
				return -1;
			}
		};
		Collections.sort(values,com);
		
		for(Integer i:values)
		{
			System.out.println(i);
		}
		
 
	}
}

