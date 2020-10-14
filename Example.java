package com.xworks.wrapperclass;

public class Example {

	public static void main(String[] args) {
		long l=30;
		int i=50;
		short s=60;
		byte b=70;
				
		int sum=l+i+s+b;     //cannot convert from long to int
		System.out.println("sum=" +sum);
		
		
		float a=9.23f;
		Float f=new Float(a);
		int c=(int) a/2;
		System.out.println(c);  // output=4
		

	}

}
