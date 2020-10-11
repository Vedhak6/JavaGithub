package com.xworkz.exception;

public class Palindrome {

	public static void main(String[] args) {
		int num=0;
		
		Palindrome p=new Palindrome();
		try {
			p.palindrome(num);
		}	
			catch (Exception e) {
				System.out.println("Exception Occured");
			}
	}
	
	void palindrome(int num) throws Exception{
		int sum=0,remainder,temp;
		temp=num;
			
		
		if(num==0) {
			Exception e =new Exception();
		    throw e;
		} else
		{	
			while(num>0)
			{
				remainder=num%10;
				sum=(sum*10)+remainder;
				num=num/10;
			}
			if(temp==num)
			System.out.println("Yes number is palindrome");
		else
			System.out.println("No number is not palindrome");
	}

	
	}

}
