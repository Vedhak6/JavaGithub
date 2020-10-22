
public class SumOfNumbers {
	public static void main(String args[]) {
		
		int n=123,i;
		
		for(i=0;n!=0;n/=10) {
			
			i=i+(n%10);
		}
		
		System.out.println("the sum of given digits :" +i);
	}
	
}
