package com.xworkz.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class StudentTester {

	public static void main(String[] args) {
		
		Student s1=new Student("Vedha",21,'B');
		Student s2=new Student("Chaitra",03,'A');
		Student s3=new Student("Sindhu",19,'B');
		Student s4=new Student("Swathi",20,'A');
		Student s5=new Student("Bindu",05,'B');
		
		LinkedList<Student> stu=new LinkedList<Student>();
		stu.addFirst(s1);
		stu.addLast(s2);
		stu.add(s3);
		stu.add(s4);
		stu.offer(s5);
		System.out.println(stu);
		
		for(Student i:stu) {
			System.out.println(i);
		}
		System.out.println("-----Iterator----- ");
		Iterator<Student> ref=stu.iterator();
		while(ref.hasNext()) {
			System.out.println(ref.next());
		}
		System.out.println("-----List Iterator----- ");
		ListIterator<Student> ref1=stu.listIterator();
		while(ref1.hasNext()) {
       	 System.out.println(ref1.next());
        }
        System.out.println(" ");
        while(ref1.hasPrevious()) {
       	 System.out.println(ref1.previous());
        }
        System.out.println(" ");
        System.out.println("Remove First :"+stu.removeFirst());
        System.out.println("Remove Last :"+stu.removeLast());
        System.out.println("Remove First Occurence :"+stu.removeFirstOccurrence(s2));
        System.out.println("Remove based index :"+stu.remove(1));
        System.out.println("Removeif :"+stu.removeIf((a)->(a!=null)));
       
        
	}
	

}
