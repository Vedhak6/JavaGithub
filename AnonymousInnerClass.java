package com.xworkz.innerClass;

class Demo { 
	   void show() { 
	      System.out.println("i am in show method of super class"); 
	   } 
	} 
	class AnonymousInnerClass { 
	  
	   //  An anonymous class with Demo as base class 
	   static Demo d = new Demo() { 
	       void show() { 
	           super.show(); 
	           System.out.println("i am in Flavor1Demo class"); 
	       } 
	   };
	   public static void main(String[] args){ 
	       d.show(); 
	   } 
	}
	