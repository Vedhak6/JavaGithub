package com.xworkz.collection;

import java.util.ArrayList;

public class FishTester {

	public static void main(String[] args) {
		
		Fish f1=new Fish("Garfish",true,"2kg");
		Fish f2=new Fish("Clownfish",true,"200g");
		Fish f3=new Fish("Blue tang",true,"1kg");
		Fish f4=new Fish("Goldfish",true,"50g");
		
		ArrayList <Fish> fishArrayList=new ArrayList <Fish>();
		fishArrayList.add(f1);
		fishArrayList.add(f2);
		fishArrayList.add(f3);
		fishArrayList.add(f4);
		
		 System.out.println( fishArrayList);
		 System.out.println("---------------------");
		for(Fish f : fishArrayList) {
			System.out.println(f);
		}
		System.out.println("---------------------");
		for(int i=0;i< fishArrayList.size();i++) {
			Fish f= fishArrayList.get(i);
			
		 String species=f.getSpecies();
		 f.setSpecies( species+" Fish");
			System.out.println(f);
		}
		System.out.println("---------------------");
		 System.out.println("Last element "+fishArrayList.get(fishArrayList.size()-1));
		 System.out.println("---------------------");
		 Fish f5=new Fish("Guppy",true,"20g");
		 fishArrayList.set(3,f5);
			for(Fish f : fishArrayList) {
				System.out.println(f);
			}
		 
			System.out.println("---------------------");
			

			 Fish f6=new Fish("Bluegill",false,"350g");
			 fishArrayList.set(0,f6);
				for(Fish f : fishArrayList) {
					System.out.println(f);
				}
		

	}

}
