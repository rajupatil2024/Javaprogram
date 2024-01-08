package com.abstraction;

public class abstractionMain {

	public static void main(String[] args) {
		Travel ref;
		ref=new Car();
		ref.journey();
		ref=new Bike();
		ref.journey();
		ref=new Cycle();
		ref.journey();

	}

}
