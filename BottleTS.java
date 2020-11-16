package com.xworkz.sets;

public class BottleTS {

	private String brand;
	private int price;
	private int litre;
	
	public BottleTS(String brand, int price, int litre) {
		super();
		this.brand = brand;
		this.price = price;
		this.litre = litre;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getLitre() {
		return litre;
	}
	public void setLitre(int litre) {
		this.litre = litre;
	}

	@Override
	public String toString() {
		return "BottleTS [brand=" + brand + ", price=" + price + ", litre=" + litre + "]";
	}

	
	
}
