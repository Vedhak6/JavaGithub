package com.xworkz.interfaceAccessModifier;

public interface Animal {
	
	 void growing();
	 void feeding();

	default void transporting() {
		System.out.println("Some domestic animal used for transportation purpose");
	}
	
}
