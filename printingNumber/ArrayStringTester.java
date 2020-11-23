package com.xworkz.printingNumber;

public class ArrayStringTester {

	public static void main(String[] args) {
		
		
		   System.out.println("Thread details :"+Thread.currentThread().getName());

		ArrayString a=new ArrayString();
		a.start();
		
		   System.out.println("End details :"+Thread.currentThread().getName());

	}

}
