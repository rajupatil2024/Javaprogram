package com.ATMComponents;

public interface ATMFunctionality {
	void viewBalance(int pin,long accountNo);
	void withdraw(int pin,double withdrawAmount,long accountNo);
	void deposit(int pin,double depositAmount,long accountNo);
	void exit();
}
