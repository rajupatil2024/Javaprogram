package com.raju.patil;

public class BookMain {

	public static void main(String[] args) {
		Book1 b1=new Book1(24,268.5,"Silent Patient");
		Book1 b2=new Book1(24,268.5,"Sherlock Holmes");
		Book1 b3=new Book1(24,268.5,"Rich Dad Poor Dad");
		
		String s1="java";
		String s2="mava";
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		

	}

}
