

public class FindNumberOfDigits {
	public static void main(String args[]) {
		
			int num=456 , count=0;
		
		do {
			
			num=num/10;
			count++;
				}
		while(num>0);
	
		System.out.println("number of digits in given input is " +count );
		
	}
	}



