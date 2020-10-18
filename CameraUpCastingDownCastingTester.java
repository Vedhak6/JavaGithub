package com.xworkz.upanddowncasting;


public class CameraUpCastingDownCastingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Camera camera=new DSLR();//upcasting
		camera.setBrand("Sony");
		camera.setPrice(7000);
		
		System.out.println("Brand :" +camera.getBrand());
		System.out.println("Price :" +camera.getPrice());
		
		camera.details();
			
		DSLR dslr=(DSLR) new Camera();//downcasting
		dslr.setBrand("canon");
		dslr.setColor("Black");
		dslr.setPrice(60000);
		dslr.setType("digital camera");
		
		System.out.println("Brand :" +dslr.getBrand());
		System.out.println("Price :" +dslr.getPrice());
		System.out.println("Color :" +dslr.getColor());
		System.out.println("Type :" +dslr.getType());
		
		dslr.details();
		
		
		
	}

}
