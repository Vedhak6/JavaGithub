package com.xworks.thisexample;

public class MedicineTester {

	public static void main(String[] args) {
		
		Medicine ocacet=new Medicine("cipla","Tablet","Bitter");
		System.out.println("company of medicine is :" +ocacet.company);
		System.out.println("type of medicine is :" +ocacet.type);
		System.out.println("taste of medicine is :" +ocacet.taste);
		
		ocacet.dosage();

	}

}
