package com.xworkz.defaultmethod.multipleinheritance;

public class BlackInkPen implements Pen,InkPen {

	@Override
	public void writing() {
		System.out.println("Writing can be done");
		
	}

	@Override
	public void drawing() {
		Pen.super.drawing();
		InkPen.super.drawing();
	}

}
