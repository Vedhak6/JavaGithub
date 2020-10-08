package com.xworkz.exception;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
	try {
			String str="cdc";
			System.out.println(str.length());
		}
	catch(NullPointerException e)
		{
			System.out.println("NullPointerException occured");
		}
	}

}
