package com.xworkz.anonymousclass;

public class GrassTester {

	public static void main(String[] args) {
		
		Grass drygrass=new Grass() {

			@Override
			public void growing() {
				System.out.println("Drygrass grows on soil");
				
			}

			@Override
			public void purpose() {
				System.out.println("Drygrass to feed animals");
				
			}	
		};
		drygrass.growing();
		drygrass.purpose();
		
		Grass greengrass=new Grass() {

			@Override
			public void growing() {
				System.out.println("Greengrass grows on soil");
				
			}

			@Override
			public void purpose() {
				System.out.println("Greengrass to feed animals");
				
			}			
			
		};
		greengrass.growing();
		greengrass.purpose();
		
	}
		
}
