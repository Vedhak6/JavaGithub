package com.xworkz.sorting;

import java.util.Comparator;

public class SortTelevisionbyInches implements Comparator<Television> {

	@Override
	public int compare(Television o1, Television o2) {
		
		return o1.getInches()-o2.getInches();
	}

	
		
		

	}
