package com.rays.oop;

public class Test {

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		System.out.println();
		System.out.println("startt diposit  method");
		System.out.println();
		System.out.println("total balance " + getBalance());
		System.out.println("Deposite amount" + amount);
		setBalance(getBalance() + amount);
		System.out.println("after deposit" + getBalance());

		System.out.println("deposit enddddddddd");
	}

	public void withdrawal(double amount) {
		System.out.println();
		System.out.println("startt withdrawal method");
		System.out.println();
		if (getBalance() > amount) {
			System.out.println("total balance " + getBalance());
			System.out.println("withdrawal amount" + amount);
			setBalance(getBalance() - amount);

			System.out.println("after withdrawal" + getBalance());

		} else {
			System.out.println("there is no sufficient money");
		}
		System.out.println("wwwww ennnddddddddd");
	}

	public static void main(String[] args) {
		Test ac = new Test();
		ac.setBalance(2000);
		ac.deposit(500);
		ac.withdrawal(100);
//		 ac.setBalance(3000);
//		ac.deposit(300);
		ac.withdrawal(2500);
		ac.deposit(300);
	}

}
