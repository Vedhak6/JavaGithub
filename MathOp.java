package methodOverloading2;

public class MathOp {
	
	static double pi;
	
	double n;
	static void initialize() {
		double pi=22/7;
		System.out.println("Initialize pi value to:" +pi);
	}
	
	
	void calculating() {
		System.out.println("The value of 22/7 is 3.14");
		
	}
   void square() {
	   pi=3.14;
	 double  n=pi*pi;
	   System.out.println("the square of pi is " +n);
   }
}
