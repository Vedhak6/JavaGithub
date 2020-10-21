package com.xworkz.defaultmethod.multipleinheritance;


public interface Pen {

	public void writing();
	
	default void drawing() {
		System.out.println("Drawing can be done using Pen");
	}
	
}
