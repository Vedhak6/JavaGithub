package com.xworkz.functionalinterface;

import java.util.function.Function;

public class FunctionFI {

	public static void main(String[] args) {
		Function <Integer,Double> func=(a)-> a / 2.0;
		System.out.println( func.apply(10));

	}

}
