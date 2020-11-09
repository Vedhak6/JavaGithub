package com.xworkz.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class CountryTester {

	public static void main(String[] args) {

      Country c1=new Country(29,"India",+91);
      Country c2=new Country(36,"United States",+1);
      Country c3=new Country(21,"United Kingdom",+44);
      Country c4=new Country(35,"Russia",+7);
      Country c5=new Country(17,"Canada",+1);
      ArrayList<Country> conAL =new ArrayList<Country>();
      conAL.add(c1);
      conAL.add(c2);
      conAL.add(c3);
      conAL.add(c4);
      conAL.add(c5);
      System.out.println(conAL);
      
      for(int i=0;i< conAL.size();i++) {
      Country c=conAL.get(i);
    	  System.out.println(c);
      }

      Collections.sort(conAL);
      System.out.println("Ascending order :"+conAL);
      Collections.reverse(conAL);
      System.out.println("Decending order :"+conAL);
      
}
}