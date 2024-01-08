package com.ATMComponents;

abstract class ATMComponents {
	private int pin;
	private double balance;
	private long accountNo;
	
	ATMComponents(int pin,double balance,long accountNo){
		setPin(pin);
		setBalance(balance);
		setAccountNo(accountNo);
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	

}
