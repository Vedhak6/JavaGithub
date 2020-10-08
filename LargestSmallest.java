package com.xworkz.array;

public class LargestSmallest {

	
	public static void main(String[] args) {
		
		int num[]= {34,56,76,76,7,};
		int smallest=num[0];
		int biggest =num[0];
		 
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>biggest)
				biggest=num[i];
			else if (num[i]<smallest)
				smallest=num[i];
		}
		
		
		System.out.println("largest in given array is" + biggest);
		System.out.println("largest in given array is" + smallest);
		

	}

}
