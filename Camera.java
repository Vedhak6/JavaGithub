package com.xworkz.upanddowncasting;

public class Camera {
	
		private String brand;
		private int price;
		
		public Camera()
		{
			System.out.println("Default parameter");
		}
		public Camera(String brand, int price) {
			super();
			this.brand = brand;
			this.price = price;
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

		void takingImages()
		{
			System.out.println("Picture can be taken");
		}

		void details()
		{
			System.out.println("Brand :" +brand+ " Price :" +price);
		}
		
		
	}


