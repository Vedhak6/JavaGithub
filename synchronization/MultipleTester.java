package com.xworkz.synchronization;

public class MultipleTester {

	public static void main(String[] args) {
		
		System.out.println("Thread details :" +Thread.currentThread().getName() );
		
		Multipleof5 mul=new Multipleof5();
		mul.printMultipleof5(5);
		
		Multipleof7 mul2=new Multipleof7();
		mul2.printMultipleof7(7);
		
		
		
		System.out.println("End details :" +Thread.currentThread().getName() );
		
	}

}
