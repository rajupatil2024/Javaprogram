package com.abstraction;

public interface Travel {
	void journey();
}
class Car implements Travel{
	public void journey() {
		System.out.println("Travel by car");
	}
}
class Bike implements Travel{
	public void journey() {
		System.out.println("Travel by Bike");
	}
}
class Cycle implements Travel{
	public void journey( ) {
		System.out.println("Travel by Cycle");
	}
}
