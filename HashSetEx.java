package com.xworkz.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet<String> color=new HashSet<String>();
		color.add("Red");
		color.add("White");
		color.add("Red");
		color.add("Green");
		color.add("Brown");
		
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
      
	}

}
