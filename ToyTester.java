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
		 toyAL.add(t3);
		 toyAL.add(t4);
		 System.out.println(toyAL);
		
		 while(true) 
			{
			    Toy e = toyAL.poll();
			    System.out.println(e);
			     
			    if(e == null) break;
			}
	}

}
