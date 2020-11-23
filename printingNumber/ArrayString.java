package com.xworkz.printingNumber;

import java.util.ArrayList;

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
		//System.out.println(str);
		
		str.forEach((a)->System.out.println(a));
		
	 System.out.println("Thread details :"+Thread.currentThread().getName());

		
		
	}

}
