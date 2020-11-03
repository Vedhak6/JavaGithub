package com.xworkz.collection;

import java.util.ArrayList;

public class DoubleArrayList {

		public static void main(String[] args) {
		
					ArrayList<Double> arrayVal=new ArrayList<Double>();
					arrayVal.add(10.00);
					arrayVal.add(20.00);
					arrayVal.add(30.00);
					arrayVal.add(40.00);
					arrayVal.add(50.00);
					
					System.out.println("Double values are :"+arrayVal);
					arrayVal.remove(1);//remove element by using index
					System.out.println("Double values are :"+arrayVal);
					arrayVal.remove(40.00);//remove element directly by using object
					System.out.println("Double values are :"+arrayVal);
					System.out.println("Is collection empty :"+arrayVal.isEmpty());// check collection is empty are not
					System.out.println("Size of collection "+arrayVal.size());//check no. of elements in collection
					
					System.out.println("Does list have 30.00 in it : "+arrayVal.contains(30.00));//searching element
					System.out.println(arrayVal);
				    System.out.println("Element in index 3 is :"+arrayVal.get(2));
				    
				    System.out.println("The index of 70.00 is :"+arrayVal.indexOf(70.00));
				    
					arrayVal.set(1, 70.00);
					System.out.println("Double values are :"+arrayVal);
					
				}

			}

			
			
			
			
			
			
			
			

		
