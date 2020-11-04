package com.xworkz.collection;

import java.util.ArrayList;

public class ToyTester {

	public static void main(String[] args) {
		
		Toy t1=new Toy(1000,true,"car");
		Toy t2=new Toy(1500,true,"teddy");
		Toy t3=new Toy(2500,false,"doll");
		Toy t4=new Toy(2700,false,"robot");
		
		ArrayList <Toy> toyArrayList=new ArrayList<Toy>();
		 toyArrayList.add(t1);
		 toyArrayList.add(t2);
		 toyArrayList.add(t3);
		 toyArrayList.add(t4);
		 
		 System.out.println( toyArrayList);
		 System.out.println("---------------------");
		for(Toy t : toyArrayList) {
			System.out.println(t);
		}
		System.out.println("---------------------");
		for(int i=0;i< toyArrayList.size();i++) {
			Toy t= toyArrayList.get(i);
			int price=t.getPrice();
			t.setPrice(price-100);
			System.out.println(t);
		}
		System.out.println("---------------------");
		 System.out.println(toyArrayList.get(3));
		 System.out.println("---------------------");
		 Toy t5=new Toy(3244,true,"train");
		 toyArrayList.set(3,t5);
			for(Toy t : toyArrayList) {
				System.out.println(t);
			}
		 
			System.out.println("---------------------");
			
			 Toy t6=new Toy(3000,false,"plane");
			 toyArrayList.set(0,t6);
			 for(Toy t : toyArrayList) {
					System.out.println(t);
				}
		
	}

}
