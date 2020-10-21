package com.xworkz.defaultmethod.multipleinheritance;


public interface InkPen  {

	
	public void writing();
	
	default void drawing() {
		System.out.println("Drawing can be done using InkPen");
	}
}
