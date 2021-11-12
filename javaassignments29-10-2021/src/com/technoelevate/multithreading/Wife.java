package com.technoelevate.multithreading;

public class Wife extends Thread {
	Account account;

	public Wife(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		Thread.currentThread().setName("Wife Thread");
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
			account.deposit(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
