package com.xworkz.functionalinterface;

import java.util.function.Supplier;

public class SupplierFI {

	public static void main(String[] args) {
		//T get()
		Supplier<String> var=()->"vedha";
		System.out.println(var.get());

	}

}
