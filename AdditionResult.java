package com.xworkz.exception;

public class AdditionResult {

	public static void main(String[] args) {
		int a=10,b=2,result=0;
		try {
			result=a/b;
			System.out.println("Result :" +result);
			
			
		}
      catch (ArithmeticException e) {
     	System.out.println( result);

	}
	}
}
	
