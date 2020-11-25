package com.xworkz.synchronization;

public class Multiple extends Thread{
	
	synchronized void printMultiple(int num) {
		
		System.out.println("Thread details :" +Thread.currentThread().getName() );
		 
		for (int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+(i*num));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("Thread details :" +Thread.currentThread().getName() );
	}
	
	 }

