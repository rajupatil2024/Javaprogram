package com.StudentCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class College {
	Scanner sc=new Scanner(System.in);
	ArrayList<Student> al=new ArrayList<>();
	
	public void addStudent() {
		System.out.println("Enter id : ");
		int id=sc.nextInt();
		System.out.println("Enter name : ");
		String name=sc.next();
		System.out.println("Enter address : ");
		String address=sc.next();
		System.out.println("Enter Age : ");
		int age=sc.nextInt();
		
		Student s=new Student(id,name,address,age);
		
		al.add(s);
		
	}
	
	public void removeStudent() {
		
		System.out.println("Enter id : ");
		int id=sc.nextInt();
		
		for(Student s : al) 
		{
			if(id==s.getId()) 
			{
				al.remove(s);
				return;
			}
		}
		System.out.println("Student doesnt Exist ");
	}
	
	public void updateStudent() 
	{
		System.out.println("Enter id : ");
		int id=sc.nextInt();
		
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Student s=(Student)i.next();
			
			if (id==s.getId())
			{
				System.out.println("Enter new address");
				String add=sc.next();
				
				s.setAddress(add);
				return;
			}
		}
		System.out.println("invalid id...");
	}
	
	public void displayStudent()
	{
		System.out.println("Enter Id : ");
		int id=sc.nextInt();
		
		for(Student s : al)
		{
			if(id==s.getId())
			{
				System.out.println(s);
			}
		}
	}
	          
	public void displayAll()
	{
		for(Student s : al)
		{
			System.out.println(s);
		}
	}

}
