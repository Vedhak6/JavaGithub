package com.xworkz.interfaceAccessModifier;

public abstract class DomesticAnimal implements Animal {

	@Override
	public void growing() {
		System.out.println("Animal start growing");
	}

	@Override
	public void feeding() {
		System.out.println("Animal need to be feed");
		
	}
	
	

}
