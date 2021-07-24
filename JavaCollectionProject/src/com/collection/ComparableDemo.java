package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<DemoClassForComparable> values=new ArrayList<>();
		values.add(new DemoClassForComparable(1,"Niya",90));
		values.add(new DemoClassForComparable(2,"meri",50));
		values.add(new DemoClassForComparable(3,"Raj",96));
		values.add(new DemoClassForComparable(4,"Rita",78));
		
		Collections.sort(values);
		for(DemoClassForComparable d:values)
		{
			System.out.println(d.number+" : "+d.name+" : "+d.marks);
		}
	}

}
