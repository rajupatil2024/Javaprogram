package com.raju.patil;

public class CuboidMain {

	public static void main(String[] args) {
		Cuboid c1=new Cuboid(10.5,15.5,25.5);
		Cuboid c2=new Cuboid(12.5,25.5,35.5);
		Cuboid c3=new Cuboid(12.3,20.5,32.5);
		Cuboid c4=new Cuboid(11.5,21.5,31.5);
		Cuboid c5=new Cuboid(11.5,21.5,31.5);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c4));
		System.out.println(c1.equals(c5));
		
		System.out.println(c2.equals(c3));
		System.out.println(c2.equals(c4));
		System.out.println(c2.equals(c5));
		
		System.out.println(c3.equals(c4));
		System.out.println(c3.equals(c5));
		
		System.out.println(c4.equals(c5));
		
		
		
		

	}

}
