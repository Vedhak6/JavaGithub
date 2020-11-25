package com.xworkz.printingNumber;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayString extends Thread {

   @Override
   public void run() {
		
	   System.out.println("Thread details :"+Thread.currentThread().getName());
		
		ArrayList<String> str=new ArrayList<String>();
		str.add("red");
		str.add("blue");
		str.add("white");
		str.add("black");
		str.add("purple");
		
	//	Iterator<String> itr=str.iterator(); //other way to traverse
	//		while(itr.hasNext()) {
	//		System.out.println(itr.next());
		
		str.forEach((a)->{
				System.out.println(a);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		  }
	 System.out.println("--------------");

		
				
	});
		 System.out.println("Thread details :"+Thread.currentThread().getName());

   }}
