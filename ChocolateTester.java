package methodOverloading2;

public class ChocolateTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chocolate c1=new Chocolate("Cadbuary",50,45,150);
		c1.getCompany();
		c1.getCocoaPercentage();
		c1.getFatPercentage();
		c1.getPrice();
		
		System.out.println();
		
		Chocolate c2=new Chocolate("Fabelle",30,15,100);
		c2.getCompany();
		c2.getCocoaPercentage();
		c2.getFatPercentage();
		c2.getPrice();

	}

}

