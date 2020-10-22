
public class Fibonnaci {


 public static void main(String args[]) {
	 
	 int f1=0,f2=1,n=5,f3=0,i=0;
	 
	System.out.println("  " +f1);
	 System.out.println("  " +f2);
	 
	 do {
		 
		 f3=f2+f1;
		 System.out.println( "  " +f3);
	     f1=f2;
	     f2=f3;
	     i++;
	 }while(i<=n );
	 	
	     
	  }
 }
 

	
	
	
