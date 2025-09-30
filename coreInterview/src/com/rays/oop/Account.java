package com.rays.oop;

public class Account {

	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		System.out.println("total balance"+getBalance());
		System.out.println("Deposit amount "+ amount);
		setBalance(getBalance()+ amount);
		System.out.println("balance after diposit :"+getBalance());
		
	}
	public void withdrawal(double amount) {
		if(getBalance() > amount) {
			System.out.println("total balance"+getBalance());
			System.out.println("withdrawal amount "+ amount);
			setBalance(getBalance()-amount);
			System.out.println("balance after withdrawl:"+ getBalance());
		}else {
			System.out.println("not enough amount for this payment");
		}
		
	}
	public static void main(String[] args) {
		Account ac = new Account();
		ac.setBalance(2000);
//		ac.deposit(500);
		ac.withdrawal(3000);
		System.out.println("total amount "+ ac.getBalance());
	}
	
}
