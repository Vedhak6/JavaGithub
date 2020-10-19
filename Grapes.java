package com.xworkz.interfaceexamples;

public class Grapes extends Fruit {
	@Override
	void growing() {
		System.out.println("tree strats to grow");
	}
	@Override
	void yeilding(){
		System.out.println("After growing tree starts to yeild fruits");
	}
	
	void taste(){
		System.out.println("taste of the fruit is sour & sweet");
	}
	
		
}
