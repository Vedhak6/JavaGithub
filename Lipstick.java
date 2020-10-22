package methodOverloading2;

public class Lipstick {
	String color="RED";
	int price=150;
	boolean isOrganic=true;
	
	void isOrganic() {
	if(isOrganic==true)
	{
		System.out.println("Lipstick is Organic");
	}
		else {
			System.out.println("Lipstick is Inorganic");
		}
			
	}

	public void openingCap()
	{
		System.out.println("Open the cap first");
	}
	
	public void applying()
	{
		System.out.println("Applying lipstick on lips");
	}
	
	
}
