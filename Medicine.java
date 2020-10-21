package com.xworks.thisexample;


public class Medicine {
	
	String company;
	String type;
	String taste;
	
	
	Medicine(String company,String type,String taste)
	{
		System.out.println("Details of medicine");
		this.company=company;
		this.type=type;
		this.taste=taste;
	}
	
	public void eating()
	{
		System.out.println("Should be taken in morning,afternoon and night");
	}
	public void dosage()
	{
		
		System.out.println("Dosage of medicine in 10smg ");
		
		
	}
	
	
	
}


