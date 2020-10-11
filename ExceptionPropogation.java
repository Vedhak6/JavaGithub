package com.xworkz.exception;

public class ExceptionPropogation {

	
		void dialing()
		{
			System.out.println("dialing a number");
		}
		void connecting() {
			System.out.println("Connecting to a number");	
		}
		
		void speak()
		{
			System.out.println("Speaking.....");
		}
		
		public static void main(String[] args) {
		
		ExceptionPropogation ep=new ExceptionPropogation();
		ep.dialing();
		ep.connecting();
		System.out.println("Not reachable");	
	}	

}
