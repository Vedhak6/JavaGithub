package methodOverloading2;

public class Sanitizer {
		String brand;
		String color;
		int price;
		
		{
			System.out.println();
			System.out.println("First initialisation block");
			brand="dettol";
			color="white";
		}
		{
			price=50;
			System.out.println("Second initialisation block");
		}

		Sanitizer()
		{
	System.out.println("brand: "+brand+" color: "+color+" price: "+price);
		}
		{
			System.out.println("Third initialisation block");
		
		}
		{
			System.out.println("Forth initialisation block");
		}
		
		Sanitizer(String inBrand,String inColor,int inPrice){
			 brand=inBrand;
			 color=inColor;
			 price=inPrice;
	 System.out.println("brand: "+brand+" color: "+color+" price: "+price);
			
		}
		
}
