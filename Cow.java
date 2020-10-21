package com.xworkz.multipleinheritanceusinginterface;

public class Cow implements Animal,DomesticAnimal {

	@Override
	public void purpose() {
		System.out.println("Animals are used for many purpoe");
		
	}

	@Override
	public void growing() {
		System.out.println("Animals starts growing after they born");
		
	}

	@Override
	public void feeding() {
		System.out.println("Animals need to be feeded properly");
		
	}
	
	
	

}
