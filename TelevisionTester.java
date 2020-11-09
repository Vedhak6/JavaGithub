package com.xworkz.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TelevisionTester {

	public static void main(String[] args) {
		
		Television t1=new Television("Mi",55,"OLED");
		Television t2=new Television("Sony",45,"LED");
		Television t3=new Television("Samsung",59,"QLEd");
		Television t4=new Television("LG",30,"Plasma Screen");
		
		ArrayList<Television> telAL=new ArrayList<Television> ();
		telAL.add(t1);
		telAL.add(t2);
		telAL.add(t3);
		telAL.add(t4);
		
		System.out.println(telAL);
		
		 for(int i=0;i< telAL.size();i++) {
		      Television t=telAL.get(i);
		    	  System.out.println(t);
		      }
		 
		 Collections.sort(telAL, new SortTelevisionbyInches());
		 System.out.println("Sorted by inches :"+telAL);
		 
		 Collections.sort(telAL, new SortByBrand());
		 System.out.println("Sorted by brand :"+telAL);
		 Collections.reverse(telAL);
		 System.out.println(telAL);
		 
		 Collections.sort(telAL, new SortByType());
		 System.out.println("Sorted by Type :"+telAL);
		 Collections.reverse(telAL);
		 System.out.println(telAL);
		 
		 
	}
	

}
