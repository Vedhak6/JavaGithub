package com.xworkz.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDouble {

	public static void main(String[] args) {
		
		ArrayList<Double> grade=new ArrayList<Double> ();
		grade.add(7.4);
		grade.add(8.6);
		grade.add(7.9);
		grade.add(1.8);
		grade.add(9.8);
		grade.add(2.6);
		grade.add(5.7);
		grade.add(9.4);
		grade.add(1.9);
		System.out.println(grade);
		
		Collections.sort(grade);
		System.out.println("Ascending order of grades :"+grade);
		Collections.reverse(grade);
		System.out.println("Decending order of grades :"+grade);
}
}