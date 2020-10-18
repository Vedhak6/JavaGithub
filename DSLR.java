package com.xworkz.upanddowncasting;


public class DSLR extends Camera{
		
		private String type;
		private String color;
		
		public DSLR()
		{
			System.out.println("Default parameter");
		}
		public DSLR(String type, String color) {
			super();
			this.type = type;
			this.color = color;
		}

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

		void goodImageQuality()
		{
			System.out.println("Image quality is good compare to normal camera");
		}
	    @Override
		void details() {
			System.out.println("Brand :" +getBrand()+ "Price :"+getPrice()+ "Type :"+type+ "Color :" +color);
		}
	}

	

