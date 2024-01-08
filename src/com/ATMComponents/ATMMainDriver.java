package com.ATMComponents;
import java.util.Scanner;

public class ATMMainDriver 
{

	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account No: ");
		long accountNo=sc.nextLong();
		System.out.println("Enter the Pin No: ");
		int pin=sc.nextInt();
		checkCredentials(pin,accountNo);
		sc.close();
	}
	static void checkCredentials(int pin,long accountNo)
	{
		ATMFunctionality raju=new ATMImplementation(2580,500,64126475262l);
		Scanner sc=new Scanner(System.in);
		System.out.println("1.View Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.Exit");
		System.out.println("Enter your Choice");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:{
				raju.viewBalance(pin,accountNo);
			}
			break;
			case 2:{
				System.out.println("Enter the Amount to withdraw");
				double withdrawAmount=sc.nextDouble();
				raju.withdraw(pin,withdrawAmount,accountNo);
				}
			break;
			case 3:{
				System.out.println("Enter the Amount to Deposit");
				double depositAmount=sc.nextDouble();
				raju.deposit(pin,depositAmount,accountNo);
			}
			break;
			case 4:{
				raju.exit();
			}
			break;
			default:{
				System.err.println("Enter valid Option");
			}
			break;
		}
		sc.close();
	}
}
