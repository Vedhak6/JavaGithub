package com.xworkz.printingNumber;

public class PrintNumberBtw1to10 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread details :"+Thread.currentThread().getId()+
				" Thread name : "+Thread.currentThread().getName());
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("Thread ending  :"+Thread.currentThread().getId()+
				" Thread name : "+Thread.currentThread().getName());
		
	}
	
	
	
	

}
