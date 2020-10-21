package com.xworkz.multipleinheritanceusinginterface;

public class CowTester {

	public static void main(String[] args) {
		
		Cow cow=new Cow();
		cow.growing();
		cow.feeding();
		cow.purpose();
		
		Animal animal=new Cow();
		animal.feeding();
		animal.growing();
		
		DomesticAnimal domesticanimal=new Cow();
		domesticanimal.growing();
		domesticanimal.purpose();

	}

}
