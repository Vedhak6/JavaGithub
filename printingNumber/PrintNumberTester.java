package com.xworkz.printingNumber;

public class PrintNumberTester {

	public static void main(String[] args) {
		
		System.out.println(" Thread details : "+Thread.currentThread().getName());
		
		PrintNumberBtw1to10 p1=new PrintNumberBtw1to10();
		Thread t1=new Thread(p1);
		t1.start();
		
		PrintNumberBtw11to20 p2=new PrintNumberBtw11to20();
		//Thread t1=new Thread(p);
		p2.start();

		
		Runnable btw21to30=new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread details :"+Thread.currentThread().getId()+
						" Thread name : "+Thread.currentThread().getName());
				
				for(int i=21;i<=30;i++) {
					System.out.println(i);
					
				}
				System.out.println("Thread ending  :"+Thread.currentThread().getId()+
						" Thread name : "+Thread.currentThread().getName());
				}
		};
		Thread t3=new Thread(btw21to30);
		t3.start();
	
	
	
	Runnable btw31to40=()-> {

			System.out.println("Thread details :"+Thread.currentThread().getId()+
					" Thread name : "+Thread.currentThread().getName());
			
			for(int i=31;i<=40;i++) {
				System.out.println(i);
				
			}
			System.out.println("Thread ending  :"+Thread.currentThread().getId()+
					" Thread name : "+Thread.currentThread().getName());
			};
			Thread t4=new Thread(btw31to40);
			t4.start();
		
		
	System.out.println(" Ending Thread : "+Thread.currentThread().getName());


	}
}
