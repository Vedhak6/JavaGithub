package com.xworkz.abstraction;

public abstract class Marker {
	
		String brand;
		String color;
		
		abstract void writing();
		abstract void marking();
		
		void mainPurpose()
		{
			System.out.println("To mark the important thing");
		}
		
		void details()
		{
			System.out.println("brand :" +brand+"||" + "color :"  +color);
		}
}
