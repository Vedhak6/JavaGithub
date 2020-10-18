package com.xworkz.abstraction;

public class WaterMarker extends Marker {
	
	int price;
	@Override
	void writing()
	{
		System.out.println("Marker can also e used for writing");
	}
	@Override
	void marking()
	{
		System.out.println(" mark important points");
	}
	@Override
	void mainPurpose()
	{
		System.out.println("To mark the important thing");
	}
	@Override
	void details()
	{
		System.out.println("brand :" +brand+"||" + "color :"  +color);
	}
		
}
