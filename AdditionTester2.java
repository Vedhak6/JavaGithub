package methodOverloading2;

import MethodOverloading.AdditionOperation;
public class AdditionTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdditionOperation ao=new AdditionOperation();
		int a=2,b=3;
		int resTwoInt=ao.addition(a,b);
		System.out.println("the result of adding 2 digits "+a+" ,"+b+" :" +resTwoInt);
		
		int c=4;
		int resThreeInt=ao.addition(a,b,c);
		System.out.println("the result of adding 3 digits "+a+" ,"+b+" and "+c+" :" +resThreeInt);
		
		double x=3.4,y=5.3;
		double resTwoDouble=ao.addition(x,y);
		System.out.println("the result of adding 2 digits "+x+" ,"+y+" :" +resTwoDouble);
		
		double z=4.5;
		double resThreeDouble=ao.addition(x,y,z);
		System.out.println("the result of adding 3 digits "+x+" ,"+y+" and "+z+" :" +resThreeDouble);
		
		long p=2345,q=56578;
		long resTwoLong=ao.addition(p,q);
		System.out.println("the result of adding 2 digits "+p+" ,"+q+" :" +resTwoLong);
		
		long r=4657;
		long resThreeLong=ao.addition(p,q,r);
		System.out.println("the result of adding 3 digits "+p+" ,"+q+" and "+r+" :" +resThreeLong);
		
		 
	}

}
