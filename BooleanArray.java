package com.xworkz.array;

public class BooleanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		boolean array[]=new boolean[n];
		array[0]=true;
		array[1]=false;
		array[2]=false;
		array[3]=true;
		
		for(int i=0;i<n;i++)
		{
			System.out.println("boolean element at :"+i+"    "+array[i]);
		}
	}

}
