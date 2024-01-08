package com.raju.patil;

public class Cuboid {
	double length;
	double breadth;
	double height;
	
	Cuboid(double length,double breadth,double height){
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	
	public String toString(){
		String s="["+this.length+","+this.breadth+","+this.height+"]";
		return s;
	}
	
	public boolean equals(Object o) {
		Cuboid c=(Cuboid)o;
		
		boolean b=this.length==c.length && this.breadth==c.breadth && this.height==c.height;
		return b;
	}

}
