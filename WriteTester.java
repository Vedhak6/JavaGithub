package MethodOverloading;

public class WriteTester {

	public static void main(String args[]) {
		
		
		Write wr=new Write();
		wr.param("vedha");
	    wr.param("vedha","k");
	    wr.param('k',"vedha");
	    wr.param('k',6);
		
			
	}
	
}
