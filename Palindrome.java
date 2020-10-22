
public class Palindrome {
	public static void main(String args[]) {
		
		int num=12323,remainder,sum=0,temp;
		temp=num;
		System.out.println("program to find palindrome of number");
		
		while(num>0)
		{
			remainder=num%10;
			sum=(sum*10)+remainder;
			num=num/10;
		}
		
		if(temp==sum)
			System.out.println("Yes number is palindrome");
		else
			System.out.println("No number is not palindrome");
	}

}
