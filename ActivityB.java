package com.xworkz.defaultmethod.multipleinheritance;

public interface ActivityB {
	
	default public void singing() {
		System.out.println("singing in activity B");
	}

}
