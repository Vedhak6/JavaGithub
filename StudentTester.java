package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentTester {

	public static void main(String[] args) {
		
		Student s1=new Student(21,"Kavya","Bengaluru");
		Student s2=new Student(19,"Asim","Mysore");
		Student s3=new Student(22,"Chai","Magadi");
		Student s4=new Student(18,"Chaitra","Bengaluru");
		ArrayList<Student> stu=new ArrayList<Student>();
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		stu.add(s4);
		System.out.println(stu);
		
		stu.forEach((a)->System.out.println(a));
		
		Comparator<Student> comparator1 = (o1, o2) -> o1.getName().compareTo(o2.getName());
		Comparator<Student> comparator2 = (o1, o2) -> o1.getAge() - o2.getAge();

		stu.sort(comparator1);
		System.out.println("Sorting name" +stu);
		
		stu.sort(comparator2);
		System.out.println("Sorting age"+stu);


		
		
	}

}
