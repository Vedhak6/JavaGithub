package com.xworkz.jaggedarray;

public class JaggedArrayExample {

	public static void main(String[] args) {
		
		int a[]= {1,2,3};
		int b[]= {4,6,7,8};
		int c[]= {3,4,5,6,7};
		
		int d[][]= {
				{1,2,3},
				{4,6,7,8},
				{3,4,5,6,7}
		};
		
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}
		
	}
}
		
		