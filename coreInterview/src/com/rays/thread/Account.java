package com.rays.thread;

public class Account {

	private int balance;

	public void setBalance(int balance) throws InterruptedException {

		Thread.sleep(200);
		this.balance = balance;
	}

	public int getBalance() throws InterruptedException {

		Thread.sleep(200);

		return balance;
	}

	public synchronized void deposite(String name, int amt) throws InterruptedException {
		// synchronized (this) {
		setBalance(getBalance() + amt);
		System.out.println(name + " " + getBalance());
		// }
	}

}
