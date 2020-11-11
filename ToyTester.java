package com.xworkz.queue;

import java.util.*;

public class ToyTester {
	
	public static void main(String[] args) {
		
		Toy t1=new Toy(1000,true,"car");
		Toy t2=new Toy(1500,true,"teddy");
		Toy t3=new Toy(2500,false,"doll");
		Toy t4=new Toy(2700,false,"robot");
		
		PriorityQueue <Toy> toyAL=new PriorityQueue<Toy>();
		 toyAL.add(t1);
		 toyAL.add(t2);
		 toyAL.offer(t3);
		 toyAL.offer(t4);
		 System.out.println(toyAL);
		 
		 for(Toy i:toyAL) {
			 System.out.println(i);
		 }
		 
		 Iterator<Toy> ref=toyAL.iterator();
		 while(ref.hasNext()) {
			 System.out.println(ref.next());	 
		 }
		
		System.out.println(toyAL.peek());
		toyAL.poll();
		System.out.println(toyAL);
		toyAL.element();
		System.out.println("toyAL.element :"+toyAL.element());
		
		
	}

}
