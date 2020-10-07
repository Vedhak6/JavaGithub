package com.xworkz.array;

public class MushroomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start of program");
		
		Mushroom[] mushroomArray=new Mushroom[5];
		
		Mushroom button=new Mushroom();
		button.viewDetails();
		mushroomArray[0]=button;
		
		Mushroom oyster=new Mushroom("Oyster","brown",1200);
	    oyster.viewDetails();
		mushroomArray[2]=oyster;
		
		Mushroom black=new Mushroom("Black mushroom","black",800);
		black.viewDetails();
		mushroomArray[4]=black;
		
		for(int i=0;i < mushroomArray.length;i++)
		{
			if(mushroomArray[i]!=null)
			{
				Mushroom m=mushroomArray[i];
			}
		}
		System.out.println("----------Print using for each----------");
		for(Mushroom m:mushroomArray)
		{	if(m!=null)
               m.viewDetails();}
		
		System.out.println("end of program");
	}

}
