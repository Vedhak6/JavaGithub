package com.xworkz.exception;

public class FinallyBlock {

	public static void main(String[] args) {
		int result;
		try {
			result=10 / 0;
			System.out.println("result :" +result);
				}
		catch(Exception e) {
			
		System.out.println("Exception is handled by catch");
		
		}
        finally {
        	
        	System.out.println("The result is printed");
        }
	}

}
