package com.xworkz.methodoverriding;

public class Mushroom {
	
	String type="button";
	String color="white";
	int price=123;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	void viewDetails() {
		
		System.out.println("type: " +type+"\n" +"color: "+color+"\n" +" price: "+price);}
		
	void test() {
		
		System.out.println("test good");
	}
	
	

}
