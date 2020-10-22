
public class PyramidProblem {
	public static void main(String args[]) {
                
		
		int num=5;
		for(int i=1;i<num;i++)
		{
			
		for(int k=1;k < num-i;k++)//num-->5-4=1  is printed    
		{
			System.out.print(" ");
		}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		
		}
	
}
}