package com.xworkz.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class StringLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> color=new LinkedList<String>();
		color.add("Red");
		color.add("White");
		color.offerFirst("Blue");
		color.add("Red");
		color.addFirst("Green");
		color.offer("Brown");
		color.addLast("Orange");
		
		System.out.println(color);
		System.out.println("-----Iterator-----");
		Iterator<String> ref=color.iterator();
         while(ref.hasNext()) {
        	 System.out.println(ref.next());
         }
        System.out.println("-----List Iterator-----"); 
         ListIterator<String> ref1=color.listIterator();
         while(ref1.hasNext()) {
        	 System.out.println(ref1.next());
         }
         System.out.println(" ");
         while(ref1.hasPrevious()) {
        	 System.out.println(ref1.previous());
         }
         System.out.println(" ");
         System.out.println("Peek :"+color.peek());
         System.out.println("Peek first :"+color.peekFirst());
         System.out.println("Peek last :"+color.peekLast());
         System.out.println(" ");
         
         System.out.println("Element :"+color.element());
         System.out.println("Get based on index :"+color.get(2));
         System.out.println("Get First :"+color.getFirst());
         System.out.println("Get Last :"+color.getLast());
         System.out.println(" ");
         
         System.out.println("Poll First :"+color.pollFirst());
         System.out.println("Poll Last :"+color.pollLast());
         color.push("Peach");
         System.out.println(color);
         System.out.println("Pop element :"+color.pop());
         
         System.out.println(" ");
         System.out.println("Remove First :"+color.removeFirst());
         System.out.println("Remove Last :"+color.removeLast());
         System.out.println("Remove First Occurence :"+color.removeFirstOccurrence("Red"));
         System.out.println("Remove based index :"+color.remove(1));
         System.out.println("Removeif :"+color.removeIf((a)->(a!=null)));
         
         
         
	}

}

