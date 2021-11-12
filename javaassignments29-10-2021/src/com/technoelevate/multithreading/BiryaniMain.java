package com.technoelevate.multithreading;

public class BiryaniMain {
	public static void main(String[] args) {
		Home home = new Home(1000);
		new BiryaniCustomer(home, 500).start();
		new BiryaniCustomer(home, 700).start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new BiryaniStock(home, 700).start();
	}
}
