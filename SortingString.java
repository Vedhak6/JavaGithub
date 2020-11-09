package com.xworkz.sorting;
import java.util.ArrayList;
import java.util.Collections;
public class SortingString {

	public static void main(String[] args) {
		
		ArrayList<String> color =new ArrayList<String>();
		color.add("Red");
		color.add("Yellow");
		color.add("Blue");
		color.add("White");
		color.add("Green");
		color.add("Brown");
		System.out.println(color);
		
		Collections.sort(color);
		System.out.println("Ascending order of grades :"+color);
		Collections.reverse(color);
		System.out.println("Decending order of grades :"+color);
		
		
		
		
	}

}
