package com.xworkz.sets;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		TreeSet<String> color=new TreeSet<String>();
		color.add("Red");
		color.add("White");
		color.add("Red");
		color.add("Orange");
		
		System.out.println(color);
		
		for(String ref:color) {
			System.out.println(ref);
		}
		System.out.println(" ");
		
		System.out.println("-----Iterator-----");
		Iterator<String> ref=color.iterator();
         while(ref.hasNext()) {
        	 System.out.println(ref.next());
         }
         System.out.println(" ");
         color.forEach((a)->System.out.println(a));
		
         System.out.println(" ");
		System.out.println("Floor :"+color.floor("Reds"));
		System.out.println("ceiling :"+color.ceiling("Red"));
		System.out.println("First :"+color.first());
		System.out.println("Last :"+color.last());
		
		System.out.println("PollFirst :"+color.pollFirst());
		System.out.println("PollLast :"+color.pollLast());
		
	}

}
