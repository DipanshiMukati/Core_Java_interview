package com.rays.exception;

public class Account {

	public double balance;

	public double getBalance() {
		return balance;

	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		System.out.println("ater balace "+ balance);
		balance = balance + amount;
   System.out.println(amount);
		System.out.println("after deposit" + balance);

	}

	public void withdrawal(double amount) {
		if((balance-amount)>=2000) {
		
		balance = balance - amount;
		System.out.println("after withdreal" + balance);

	}else {
		throw new InsufficiantException("withdrwal denied");
		
	}
}}
