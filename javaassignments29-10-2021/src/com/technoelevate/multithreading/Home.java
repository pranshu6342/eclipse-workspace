package com.technoelevate.multithreading;

public class Home {
	int biryaniQuantity;

	public Home(int biryaniQuantity) {
		super();
		this.biryaniQuantity = biryaniQuantity;
	}

	public synchronized void store(int quantity) {
		biryaniQuantity += quantity;
		System.out.println("Biryani Stored  was successfully");
		System.out.println("Avilable  Quantity is : " + biryaniQuantity);
		this.notify();
	}

	public synchronized void purchase(int quantity) {
		while (biryaniQuantity < quantity) {
			System.out.println("Out of stock !!! Please wait for some time");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		biryaniQuantity -= quantity;
		System.out.println("Purchase successfully\nAvilable product Quantity is : " + biryaniQuantity);

	}
}
