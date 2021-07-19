package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsersObjectsCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> batch=new ArrayList<>();
		batch.add(new Student(1,67));
		batch.add(new Student(2,35));
		batch.add(new Student(3,98));
		for(Student s:batch)
		{
			System.out.println(s);
		}
		
		System.out.println("After sorting");
		//No need to define compare() method in Annonymous class,Using lambda Expression we can pass Comparator reference to sort method.
		Collections.sort(batch,(o1,o2) ->{
			return o1.marks>o2.marks?-1:o1.marks<o2.marks?1:0;
		});
		for(Student s:batch)
		{
			System.out.println(s);
		}
		
	}

}
class Student
{
	int rollnumber;
	int marks;
	Student(int rollnumber, int marks) {
		this.rollnumber = rollnumber;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", marks=" + marks + "]";
	}
	
}