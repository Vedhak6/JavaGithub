package com.xworkz.collection;
import java.util.ArrayList;

public class CharArrayList {
	
			public static void main(String[] args) {
			
						ArrayList<Character> arrayVal=new ArrayList<Character>();
						arrayVal.add('A');
						arrayVal.add('B');
						arrayVal.add('C');
						arrayVal.add('D');
						arrayVal.add('E');
						
						System.out.println("Characters are :"+arrayVal);
						arrayVal.remove(1);//remove element by using index
						System.out.println("Characters are :"+arrayVal);
						arrayVal.remove(new Character('D'));//remove element directly by using object
						System.out.println("Characters  are :"+arrayVal);
						System.out.println("Is collection empty :"+arrayVal.isEmpty());// check collection is empty are not
						System.out.println("Size of collection "+arrayVal.size());//check no. of elements in collection
						
						System.out.println("Does list have A in it : "+arrayVal.contains('A'));//searching element
						System.out.println(arrayVal);
					    System.out.println("Element in index 3 is :"+arrayVal.get(2));
					    
					    System.out.println("The index of C is :"+arrayVal.indexOf('C'));
					    
						arrayVal.set(1, 'V');
						System.out.println("Replace char in index 1 by V :"+arrayVal);
						
					}

				}

				
				
				
				
				
				
				
				

			

	
	
	
	
	
	

