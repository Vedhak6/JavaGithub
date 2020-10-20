package com.xworkz.interfaceAccessModifier;

public class CowTester {

	public static void main(String[] args) {
		
		Animal animal=new Cow();
		animal.feeding();
		animal.transporting();
		animal.growing();
		
		
		Cow cow=new Cow();
		cow.milkProducts();
		
		

	}

}
