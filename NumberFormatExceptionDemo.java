package com.xworkz.exception;

public class NumberFormatExceptionDemo {
	
	public static void main(String[] args) {
	try {
			int num=Integer.parseInt( "number");
			System.out.println(num);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number format exception occurred");
		}

	}

}
