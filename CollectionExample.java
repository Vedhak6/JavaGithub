package com.xworkz.collection;
import java.util.ArrayList;


public class CollectionExample {

	public static void main(String[] args) {
	
				ArrayList arrayVal=new ArrayList<>();
				arrayVal.add("Name");
				arrayVal.add(10);
				arrayVal.add(true);
				arrayVal.add(25.00);
				arrayVal.add(null);
				System.out.println(arrayVal.toString());
				
				System.out.println(arrayVal);//.tostring is overridden to display elements
				System.out.println("Is collection empty "+arrayVal.isEmpty());// check collection is empty are not
				System.out.println("Size of collection "+arrayVal.size());//check no. of elements in collection
				
				System.out.println("Remove 25.00 element from collection "+ arrayVal.remove(25.00));//remove element 
				System.out.println(arrayVal);
				System.out.println("Now the size of collection is "+arrayVal.size());
				System.out.println("Collection have 11 element in it "+arrayVal.contains(11));//searching element
				
			}

		}

		
		
		
		
		
		
		
		

	
