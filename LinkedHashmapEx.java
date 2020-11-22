package com.xworkz.maps;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashmapEx {

public static void main(String[] args) {
		
		//Employee 
		LinkedHashMap<Integer,String> aadhar = new LinkedHashMap<Integer,String>();
				
		
				
		aadhar.put(367898766,"Ram" );
		aadhar.put(467894467,"Raj");
		aadhar.put(768989661,"Sanju");
		aadhar.put(256776777,"Anand");
				
		System.out.println(aadhar);
			
		aadhar.put(256776777,"Arun");
		aadhar.put(456765676,"Anand");
		
		
		//Traversing
		aadhar.forEach((k,v)->System.out.println("key:" + k +  " value: " + v));
        //
		System.out.println("------------");
		Set<Integer> keyset=aadhar.keySet();
		
		for(Integer i : keyset) {
			System.out.println("key :"+i + " value :"+aadhar.get(i));
		}
		//
		System.out.println("------------");
		Set<Entry<Integer,String>> entry=aadhar.entrySet();
		
		for(Entry<Integer,String> i : entry) {
			System.out.println("key :"+i.getKey()+ " value :"+i.getValue());
		}
		
		

}
}