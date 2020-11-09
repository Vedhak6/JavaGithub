package com.xworkz.sorting;

import java.util.ArrayList;

public class SanitizerTester {

	public static void main(String[] args) {
		
		Sanitizer s1=new Sanitizer("Savlon",89,false);
		Sanitizer s2=new Sanitizer("Wild stone",77,true);
		Sanitizer s3=new Sanitizer("Himalaya",99,false);
		Sanitizer s4=new Sanitizer("Rosscare",200,false);
		
		
		ArrayList<Sanitizer> SanAL=new ArrayList<Sanitizer>();
		SanAL.add(s1);
		SanAL.add(s2);
		SanAL.add(s3);
		SanAL.add(s4);
		
		System.out.println(SanAL);
		
		  for(Sanitizer ref:SanAL) {
	        	System.out.println(ref);
	        }
		  
		System.out.println("Last element of the list:"+SanAL.get(SanAL.size()-1));
		
		 Sanitizer s5=new Sanitizer("Axiom",67,true);
	     System.out.println(SanAL.set(3, s5));
	     Sanitizer s6=new Sanitizer("plum",87,false);
	     System.out.println(SanAL.set(0, s6));
	     
	   

	}

}
