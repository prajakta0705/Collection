package com.collection;

public class DemoClassForComparable implements Comparable<DemoClassForComparable> {
	
	int number;
	String name;
	int marks;
	public DemoClassForComparable(int number, String name, int marks) {
		super();
		this.number = number;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public int compareTo(DemoClassForComparable d) {
		if (marks< d.marks)
			return 1;
		else
			return -1;
	}
	

}
