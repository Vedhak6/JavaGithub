package com.xworkz.abstraction;

public class MarkerTester {
	
	public static void main(String args[]) {
		
		WaterMarker watermarker=new WaterMarker();
		 watermarker.brand="Copic";
		 watermarker.color="Black";
		 watermarker.price=50;
		 watermarker.marking();
		 watermarker.writing();
		 watermarker.mainPurpose();
		 watermarker.details();
		 
		 System.out.println("===========================");
		Marker marker=new WaterMarker();
		 marker.brand="Tombow";
		 marker.color="green";
		 marker.marking();
		 marker.writing();
		 marker.mainPurpose();
		 marker.details();
		 
		 
		
	}
	
	
	
	

}
