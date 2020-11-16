package com.xworkz.sets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		
		LinkedHashSet<Character> alphabet=new LinkedHashSet<Character>();
		 alphabet.add('A');
		 alphabet.add('B');
		
		 alphabet.add('C');
		
		 alphabet.add('D');
		
		
		System.out.println( alphabet);
		
		for(Character ref: alphabet) {
			System.out.println(ref);
		}
		System.out.println(" ");
		
		System.out.println("-----Iterator-----");
		Iterator<Character> ref= alphabet.iterator();
         while(ref.hasNext()) {
        	 System.out.println(ref.next());
         }
       

	}

}
