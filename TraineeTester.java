package com.xworkz.equalandhashcode;

import java.util.HashMap;


public class TraineeTester {

	public static void main(String[] args) {
		
		//Trainee t1=new Trainee("Krupa", 56);
		//Trainee t2=new Trainee("Vinay", 45);
		//Trainee t3=new Trainee("Krupa", 56);
		
		HashMap<String,Integer> hashmap=new HashMap<String,Integer>();
		
		hashmap.put("Krupa", 56);
		hashmap.put("vinay", 76);
		hashmap.put("Krupa",56);
		System.out.println(hashmap);
		
		
		
		
	}

}
