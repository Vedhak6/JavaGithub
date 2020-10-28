package com.xworkz.functionalinterface;

import java.util.function.Consumer;

public class ConsumerFI {

	public static void main(String[] args) {
		Consumer <String> fruitname=(str)-> System.out.println("Fruit names :"+str);
		fruitname.accept("Apple");
		fruitname.accept("Banana");
		fruitname.accept("Grapes");
		fruitname.accept("Orange");
	}

}
