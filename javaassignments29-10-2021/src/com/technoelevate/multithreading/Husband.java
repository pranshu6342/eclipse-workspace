package com.technoelevate.multithreading;

public class Husband extends Thread {
	Account acc;

	public Husband(Account acc) {
		super();
		this.acc = acc;
	}

	@Override
	public void run() {
		Thread.currentThread().setName("Husband Thread");
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
			acc.deposit(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}