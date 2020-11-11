package com.xworkz.queue;

public class Toy implements Comparable<Toy> {
	
		private int price;
		private boolean isMadeinIndia;
		private String type;
		
		public Toy(int price, boolean isMadeinIndia, String type) {
			super();
			this.price = price;
			this.isMadeinIndia = isMadeinIndia;
			this.type = type;
		}
		
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public boolean isMadeinIndia() {
			return isMadeinIndia;
		}
		public void setMadeinIndia(boolean isMadeinIndia) {
			this.isMadeinIndia = isMadeinIndia;
		}
		
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
		@Override
		public String toString() {
			return "Toy [price=" + price + ", isMadeinIndia=" + isMadeinIndia + ", type=" + type + "]";
		}

		@Override
		public int compareTo(Toy o) {
			int result=this.price-o.price;
			return result;
		}
		

	}

	
	
	
	
	


