package com.xworkz.exception;

public class TryWithoutCatch {

	public static void main(String[] args) {
		try {
			
		System.out.println("executing try block");
		}
		finally {
			System.out.println("executing finally block");
		}
	}

}
