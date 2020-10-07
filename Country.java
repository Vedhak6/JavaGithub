package com.xworkz.array;

public class Country {
	String name;
	String currency;
	long population;
	
	
	Country(String inName,long inPopulation)
	{
		name=inName;
		population=inPopulation;
	}
	
	Country(String inName,String inCurrency,long inPopulation)
	{
		name=inName;
		currency=inCurrency;
		population=inPopulation;
	}
	
	void DetailsOfCountry() {
		
		System.out.println("name :" +name+ "\n"+"currency :" +currency+"\n "+"population:"+population);
	}
	
	
	
}
