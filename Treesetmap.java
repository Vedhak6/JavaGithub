package com.xworkz.maps;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Treesetmap {

	public static void main(String[] args) {
		
		TreeMap<String,Integer> month = new TreeMap<String,Integer>();
		month.put("january",31);
		month.put("february",28);
		month.put("march",31);
		month.put("april",30);
		month.put("may",31);
		month.put("june",30);
		System.out.println(month);
		
		System.out.println("-------------");
		month.forEach((k,v)->System.out.println("key:" + k +  " value: " + v));
		
		System.out.println("------------");
		Set<Entry<String,Integer>> entry=month.entrySet();
		
		for(Entry<String,Integer> i : entry) {
			System.out.println("key :"+i.getKey()+ " value :"+i.getValue());
		
		}
	}

}
