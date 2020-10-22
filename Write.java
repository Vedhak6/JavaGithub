package MethodOverloading;

public class Write {
	
	
	
	public void param(String name1) {
		System.out.println("name is :" +name1);
	}
	
	public void param(String name1,String name2)
	{
		System.out.println("name is :" +name1  +name2);
		//System.out.println("name is :" +name2);
		
	}
	
	public void param(char y,String s)
	{
		System.out.println(y +","+s);
	}
	
	
	public void param(char y,int n)
	{
		System.out.println(y +","+n);
	}
	
	

}
