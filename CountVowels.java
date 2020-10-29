package com.xworkz.stringsExamples;

public class CountVowels {
	
static boolean isVowel(char ch) 
{ 
    ch = Character.toUpperCase(ch); 
    return (ch=='A' || ch=='E' || ch=='I' || 
                       ch=='O' || ch=='U'); 
} 
  
static int countVowels(String str) 
{ 
    int count = 0; 
    for (int i = 0; i < str.length(); i++) 
        if (isVowel(str.charAt(i))) // Check for vowel 
            ++count; 
    return count; 
} 
   

public static void main(String args[]) 
{ 
    
    String str = "Welcome to xworkz"; 
   
    
    System.out.println(countVowels(str)); 
} 
} 