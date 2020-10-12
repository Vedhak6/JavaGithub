package com.xworks.customexception;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=in.nextInt();
	    int remainder=0,sum=0,temp;
		temp=num;
		
		
		while(num>0)
		{
			remainder=num%10;
			sum=(sum*10)+remainder;
			num=num/10;
		}
		
		if(temp==sum)
			System.out.println("Yes number is palindrome");
		else
			System.out.println("No number is not palindrome");
	}

	}


