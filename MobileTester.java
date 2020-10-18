package com.xworkz.interfaceConcept;

public class MobileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Child class");

		SmartMobile smartmobile=new SmartMobile();
		smartmobile.brand="MI";
		smartmobile.price=17000;
		smartmobile.storage="4G";
		smartmobile.calling();
		smartmobile.messaging();
		smartmobile.gaming();
		smartmobile.details();
		System.out.println("---------------------------------");
		System.out.println("Parent Class");
		DualSimMobile dualsimmobile=new SmartMobile();
		dualsimmobile.brand="Realme";
		dualsimmobile.price=18000;
		dualsimmobile.calling();
		dualsimmobile.messaging();
		dualsimmobile.gaming();
		dualsimmobile.details();
		
		
		
		
		
		
		
		
	}

}
