package com.xworkz.sets;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class BottletTSTester {

	public static void main(String[] args) {
		
		Comparator<BottleTS> comp=(o1,o2)->{
			return o1.getBrand().compareTo(o2.getBrand());
		};
	    
		BottleTS b1=new BottleTS("Cello",140,1);
		BottleTS b2=new BottleTS("Pearl",120,2);
		BottleTS b3=new BottleTS("Invert",70,1);
		BottleTS b4=new BottleTS("Rooby",45,1);
		TreeSet<BottleTS> bottle=new TreeSet<BottleTS>(comp);
		bottle.add(b1);
		bottle.add(b2);
		bottle.add(b3);
		bottle.add(b4);
		
		System.out.println(bottle);
	
		
		for(BottleTS ref: bottle) {
			System.out.println(ref);
		}
		System.out.println(" ");
		
		System.out.println("-----Iterator-----");
		Iterator<BottleTS> ref= bottle.iterator();
         while(ref.hasNext()) {
        	 System.out.println(ref.next());
         }
         System.out.println(" ");
         bottle.forEach((a)->System.out.println(a));
         System.out.println(" ");
         System.out.println("Floor :"+bottle.floor(b2));
         System.out.println("Celing :"+bottle.ceiling(b1));
         System.out.println("First :"+bottle.first());
         System.out.println("Last :"+bottle.last());
         System.out.println("PollFirst :"+bottle.pollFirst());
         System.out.println("PollLast :"+bottle.pollLast());
         
         
         
         
         
         
	}

	}


