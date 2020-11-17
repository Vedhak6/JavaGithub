package com.xworkz.sets;

import java.util.HashSet;
import java.util.Iterator;

public class VirusHSTester {

	public static void main(String[] args) {
		
		HashSet<VirusHS> virus=new HashSet<VirusHS>();
		virus.add(new VirusHS("corona",true));
		virus.add(new VirusHS("Ebola",true));
		virus.add(new VirusHS("Influenza",false));
		virus.add(new VirusHS("Rabies",true));
		
		System.out.println(virus);
		
		for(VirusHS ref: virus) {
			System.out.println(ref);
		}
		System.out.println(" ");
		
		System.out.println("-----Iterator-----");
		Iterator<VirusHS> ref= virus.iterator();
         while(ref.hasNext()) {
        	 System.out.println(ref.next());
         }
         System.out.println(" ");
         virus.forEach((a)->System.out.println(a));
	}

}
