package com.xworkz.functionalinterface;

public class NoArgumentFITester {

	public static void main(String[] args) {
		
		NoargumentFI noarg=new NoargumentFI() {

			@Override
			public void PrintHello() {
				System.out.println("Hello world");
				
			}
			
		};
		noarg.PrintHello();
		
		NoargumentFI noargu=()->{
			System.out.println("Hello world");
		};
		noargu.PrintHello();
	}

}
