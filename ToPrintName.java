package MethodOverloading;

public class ToPrintName {
	public String myMethod(String name,int num)
	{
		String str="this is first myMethod";
		return str;
	}
	
	public String myMethod(int num,String name)
	{
		String str="this is second myMethod";
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ToPrintName test=new ToPrintName();
		String res =test.myMethod(5, "vedha");
		System.out.println(res);
		
	}

}
