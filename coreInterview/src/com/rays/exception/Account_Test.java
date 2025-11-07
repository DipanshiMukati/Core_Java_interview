package com.rays.exception;

public class Account_Test {
	public static void main(String[] args) {
		Account a = new Account();
		a.setBalance(2000);
		a.deposit(1500);
		try {
			a.withdrawal(100);
		} catch (InsufficiantException e) {

			System.out.println(e);
		}
	
//  a.setBalance(7000);
   System.out.println("sssssssssssssssssssssssss");

		a.deposit(2300);
		try {
             a.withdrawal(4700);
		} catch (InsufficiantException e) {
			System.out.println(e);
		}
	}
}
