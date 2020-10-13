package com.xworkz.methodoverriding;

public class NonvegFood extends Food {

	public int getCalories() {
		calories=234;
		System.out.println("Calories :"+calories);
		return calories;
	}
	void protein()
	{
		System.out.println("Have more protein than veg food");
	}
}
