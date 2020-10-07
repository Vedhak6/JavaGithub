package com.xworkz.array;

public class Array {

	public static void main(String arg[]) {
		
		System.out.println("Start Program");
		int n=5,total=0,percentage;
		int marks[]=new int[n];
		marks[0]=55;
		marks[1]=65;
		marks[2]=44;
		marks[3]=76;
		marks[4]=38;

		for(int i=0;i<n;i++)
		{
			int temp=marks[i];
					total=total+marks[i];
		}
	 percentage=total/n;
		System.out.println("sum:" +total);
		System.out.println("percentage:" +percentage);
		
	}
	
}
