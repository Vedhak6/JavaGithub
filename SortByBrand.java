package com.xworkz.sorting;

import java.util.Comparator;

public class SortByBrand implements Comparator<Television> {

	@Override
	public int compare(Television o1, Television o2) {
		
		return o1.getBrand().compareTo(o2.getBrand());
	}
}
