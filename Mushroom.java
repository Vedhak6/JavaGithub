package com.xworkz.array;

public class Mushroom {
	
	String type;
	String color;
	int price;
	
	Mushroom()
	{
	System.out.println("NO DETAILS");
	}
	
	Mushroom(String inType,String inColor,int inPrice)
	{
		type=inType;
		color=inColor;
		price=inPrice;
		System.out.println("HAVE DETAILS");
			}
	
	void viewDetails() {
		
		System.out.println("type: " +type+"\n" +"color: "+color+"\n" +" price: "+price);
		
	}

}
