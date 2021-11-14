package com.technoelevate.synchronize;



public class AccountTestingWithSynchronize implements Runnable {
	private Accounts acct = new Accounts();

	public static void main(String[] args) {
		AccountTestingWithSynchronize r = new AccountTestingWithSynchronize();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.setName("Ranjeet");
		two.setName("Reema");
		one.start();
		two.start();
	}

	@Override
	public void run() {
		for (int x = 0; x < 5; x++) {
			makeWithdrawal(1000);
			if (acct.getBalance() < 0) {
				System.out.println("account is overdrawn!");
			}
		}
	}

	public  synchronized void makeWithdrawal(int amt) {
		if (acct.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
			}
			acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
		} else {
			System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw "
					+ acct.getBalance());
		}
	}
}
