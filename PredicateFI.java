package com.xworkz.functionalinterface;

import java.util.function.Predicate;

public interface PredicateFI {

	public static void main(String[] args) {
		Predicate <Integer> predicate=(a)->{
			
			if(a>10)
			{
				return true;
				}
				else {
				return false;
				}		
			};
			boolean result = predicate.test(20);
		
            System.out.println("Result :" +result);
            
            
            Predicate <Integer> predicate2=(a)->a>10;
            System.out.println("20 is greater or not :" +predicate.test(20));
	}

}

