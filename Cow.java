package com.xworkz.interfaceAccessModifier;

public class Cow extends DomesticAnimal{
	
	static String purpose="Milk production";
	static int noofcow=10;
	
	protected void milkProducts(){
		System.out.println("Can produce many milk products");
	}
	
	private void profit() {
		System.out.println("it is profitable");
	}
	

}
