package com.xworks.wrapperclass;

public class CharExample {

	public static void main(String[] args) {
		System.out.println("Start Program");
		char c='A';
		
		Character ch=new Character(c); //Boxing
		System.out.println("The value of ch is " +ch);
		
		Character charVal=c;    //AutoBoxing
		System.out.println("The value of character is :" +charVal);
		
		char a=Character.valueOf(ch);    //Unboxing
		System.out.println("The value of a :"+a);
		
		char k=ch;  //Autounboxing
		System.out.println("The value of k :" +k);
		
		int b=(int)c;
		System.out.println("The value is " +b);//narrowing
		
		int x=ch+26;
		ch=(char)a;System.out.println(c);
		
		System.out.println("End program");
		
	}

}
