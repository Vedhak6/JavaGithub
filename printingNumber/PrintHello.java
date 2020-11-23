package com.xworkz.printingNumber;

public class PrintHello extends Thread {
	
	@Override
	public void run() {
		System.out.println("Thread details :"+Thread.currentThread().getName());
		
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
		}
		System.out.println("End details :"+Thread.currentThread().getName());
		
		
	}

}
