package com.xworks.wrapperclass;

public class DoubleExample {

	public static void main(String[] args) {
		System.out.println("Start Program");
		double c=50.55;
		
		Double d=new Double(c); //Boxing
		System.out.println("The value of d is " +d);
		
		Double dVal=c;    //AutoBoxing
		System.out.println("The value of double is :" +dVal);
		
		double a=Double.valueOf(d);    //UnBoxing
		System.out.println("The value of a :"+a);
		
		double k=d;  //AutoUnBoxing
		System.out.println("The value of k :" +k);
		
		int b=(int)c;
		System.out.println("The value is " +b);  //narrowing
		
		System.out.println("End program");

	}

}
