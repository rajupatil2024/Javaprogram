package com.raju.patil;

public class Book1 {
	int book_id;
	double price;
	String book_name;
	
	Book1(int book_id,double price,String book_name){
		this.book_id=book_id;
		this.price=price;
		this.book_name=book_name;
	}
	
	public int hashcode() {
		int hc=this.book_id+(int)this.price+this.book_name.hashCode();
		return hc;
	}

}
