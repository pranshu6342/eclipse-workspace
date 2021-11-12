package com.technoelevate.multithreading;




public class Account {
	int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public synchronized void withdraw(int amount) {
		if (amount > balance) {
			System.out.println("Insufficient balance");
		}
		balance -= amount;
		System.out.println("Withdraw successful");
		System.out.println("Available balance: "+balance);
	}

	public synchronized void deposit(int amount) {
		balance += amount;
		System.out.println("Deposit successful");
		System.out.println("Available balance is: "+balance);
	}

	public synchronized void checkBalance() {
		System.out.println("Balance is: "+balance);
	}
}