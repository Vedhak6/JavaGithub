package com.xworkz.sorting;

public class Sanitizer {

	private String brand;
	private int price;
	private boolean isAlcoholic;
	
	public Sanitizer(String brand, int price, boolean isAlcoholic) {
		super();
		this.brand = brand;
		this.price = price;
		this.isAlcoholic = isAlcoholic;
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
	public boolean isAlcoholic() {
		return isAlcoholic;
	}
	public void setAlcoholic(boolean isAlcoholic) {
		this.isAlcoholic = isAlcoholic;
	}

	@Override
	public String toString() {
		return "Sanitizer [brand=" + brand + ", price=" + price + ", isAlcoholic=" + isAlcoholic + "]";
	}
	
	
	
}
