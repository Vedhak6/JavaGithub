package com.xworkz.array;

public class MissingElement {
	
	static int missingNo(int a[],int n)
	{
		int i,total;
		total=(n+1)*(n+2) / 2;
		for(i=0;i<n;i++)
		total=total-a[i];
		return total;
	}
	
	

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,7,8};
		int miss=missingNo(a,7);
		System.out.println(miss);
		

	}

}
