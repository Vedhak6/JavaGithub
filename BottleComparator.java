package com.xworkz.sets;

import java.util.Comparator;

public class BottleComparator implements Comparator<BottleTS> {

	public static void main(String[] args) {
		
		
	}
	

	@Override
	public int compare(BottleTS o1, BottleTS o2) {
		
		return o1.getPrice()-o2.getPrice();
	}

}
