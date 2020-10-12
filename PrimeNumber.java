package com.xworks.customexception;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		 if(isPrime(n)) {
			 System.out.println("the number "+n+" is not prime number");}
		 else {
			 System.out.println("the number "+n+" is  prime number");
			 }
		 	}

	public static boolean isPrime (int n) {
		if(n<1) {
		return false;
	}
		for(int i=2;i<Math.sqrt(n);i++) {
			
			if(n%i==0) {
				return false;
			}
		}
		return true;
}
}
