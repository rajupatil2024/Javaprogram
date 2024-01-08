package com.ATMComponents;

public class ATMImplementation extends ATMComponents implements ATMFunctionality {
	public ATMImplementation(int pin,double balance,long accountNo){
		super(pin,balance,accountNo);
	}
	public void viewBalance(int pin,long accountNo)
	{
		if(getPin()==pin) 
		{
			if(getAccountNo()==accountNo)
			{
				System.out.println("Account Balance is : "+getBalance());
			}
			else {
				System.err.println("Your Account no is Invalid");
			}
		}
		else {
			System.err.println("Your pin is Incorrect");
		}
	}
	public void deposit(int pin,double depositAmount,long accountNo)
	{
		if(getPin()==pin)
		{
			if(getAccountNo()==accountNo) 
			{
				if(depositAmount<50000)
				{
					setBalance(getBalance()+depositAmount);
					viewBalance(pin,accountNo);
				}
				else {
					System.err.println("Amount is Exceeding the limit");
				}
			}
			else {
				System.err.println("Your Account no is Invalid");
			}
		}
		else {
			System.err.println("Your pin is Incorrect");
		}
	}
	
	public void withdraw(int pin,double withdrawAmount,long accountNo)
	{
		if (accountNo==getAccountNo() && pin==getPin()) 
		{
			if(withdrawAmount==40000)
			{
				if(withdrawAmount%200==0 ||withdrawAmount%500==0) 
				{
					if(withdrawAmount<=(getBalance()-500))
					{
						setBalance(getBalance()-withdrawAmount);
						System.out.println("Withdraw Successfully");
						viewBalance(pin,accountNo);
					}
					else {
						System.err.println("Insufficient Balance");
					}
				}
				else {
					System.err.println("Please Enter the Amount in the multiple of 500 and 200");
				}
			}
			else {
				System.err.println("Withdraw limit exceeded");
			}	
		}
		else {
			System.err.println("Account no or Pin is Invalid/Not Matching");
		}
	}
	public void exit() {
		System.out.println("Thank you for using ATM");
	}
}