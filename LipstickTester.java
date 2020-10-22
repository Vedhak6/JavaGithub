package methodOverloading2;

//import java.inheritance.Lipstick;

public class LipstickTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LiquidLipstick mac=new LiquidLipstick();
		
		System.out.println("Lipstick color is " + mac.color);
		System.out.println("Lipstick price is " + mac.price);
		
		
		mac.openingCap();
		mac.applying();
		mac.smudgeProof();
		mac.longLasting();
		mac.isOrganic();

	}

}
