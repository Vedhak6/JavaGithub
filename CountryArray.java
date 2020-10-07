package com.xworkz.array;

public class CountryArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country[] countryArray=new Country[5];
		
		Country india=new Country("India","Rupee",127);
		countryArray[0]=india;
		Country korea=new Country("South Korea",60);
		countryArray[1]=korea;
		
		for(int i=0;i <  countryArray.length;i++)
		{
			if( countryArray[i]!=null)
			{
				Country c= countryArray[i];
				c.DetailsOfCountry();
			}
		}
		
		System.out.println("----------Print using for each----------");
		for(Country c:countryArray)
		{	if(c!=null)
               c.DetailsOfCountry();}
		
		
		
	}
}
