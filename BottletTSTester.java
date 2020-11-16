package com.xworkz.sets;


import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class BottletTSTester {

	public static void main(String[] args) {
	
		TreeSet<BottleTS> bottle=new TreeSet<BottleTS>();
		bottle.add(new BottleTS("Cello",140,1));
		bottle.add(new BottleTS("Pearl",120,2));
		bottle.add(new BottleTS("Invert",70,1));
		bottle.add(new BottleTS("Rooby",45,1));
		
		System.out.println(bottle);
		
	//	Collections.sort(bottle,new BottleComparator());
		
		for(BottleTS ref: bottle) {
			System.out.println(ref);
		}
		System.out.println(" ");
		
		System.out.println("-----Iterator-----");
		Iterator<BottleTS> ref= bottle.iterator();
         while(ref.hasNext()) {
        	 System.out.println(ref.next());
         }
		
	}

	}


