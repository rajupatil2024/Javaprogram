package com.StudentCollection;

import java.util.Scanner;

public class CollegeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		College c=new College();
		
		boolean control=true;
		while(control)
		{
			System.out.println("WELCOME TO COLLEGE");
			System.out.println("1.Add Student Details\n 2.Remove Student from College\n 3.Update Student Address\n 4.Display Student name by Id\n 5.Display all Student Details\n 6.Exit");
			System.out.println("Enter your Choice:");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				c.addStudent();
				break;
			}
			case 2:
			{
				c.removeStudent();
				break;
			}
			case 3:
			{
				c.updateStudent();
				break;
			}
			case 4:
			{
				c.displayStudent();
				break;
			}
			case 5:
			{
				c.displayAll();
				break;
			}
			case 6:
			{
				control=false;
				System.out.println("Application Closed.");
				break;
			}
			default:
			{
				System.out.println("Invalid Choice !!!");
			}
			}
		}
	}

}
