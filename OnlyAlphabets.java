package com.xworkz.stringsExamples;

public class OnlyAlphabets {
	

	   public static void main(String[] args) {
	      String str = "MICK check 123 123 !!";
	      boolean result = str.chars().allMatch(Character::isLetter);
	      System.out.println("String contains only alphabets? = "+result);
	   }
	}


