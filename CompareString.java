package com.xworkz.stringsExamples;

public class CompareString {
	
	
	public static void main(String[] args) {
		
		String str1="Welcome";
		String str2="Welcome";
		
		boolean result=str1.equals(str2);
		System.out.println("Result of str1.equals(str2):"+result);
		
		String s1=new String("hello");
		String s2=new String("hello");
		
		boolean result2=s1.equals(s2);
		System.out.println("Result of s1.equals(s2):"+result2);
		
		String name1="A";
		String name2="A";
		int compRes=name1.compareTo(name2);
		System.out.println("Result of name1.compareTo(name2)"+compRes);
		
	}
	
	

}
