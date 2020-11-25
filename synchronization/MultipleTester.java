package com.xworkz.synchronization;

public class MultipleTester {

	public static void main(String[] args) {
		
		System.out.println("Thread details :" +Thread.currentThread().getName() );
		
		Multiple multiple=new Multiple();
		multiple.start();
		
		Runnable r1 =()->multiple.printMultiple(2);
		Thread t1 = new Thread(r1);
		t1.start();
		
		Runnable r2 =()->multiple.printMultiple(7);
		Thread t2 = new Thread(r2);
		t2.start();
		
		
		System.out.println("End details :" +Thread.currentThread().getName() );
		
	}

}
