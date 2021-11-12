package com.technoelevate.multithreading;

public class Godown {
	int productQuantity;

	public Godown(int productQuantity) {
		super();
		this.productQuantity = productQuantity;
	}

	public synchronized void store(int count) {
		productQuantity += count;
		System.out.println("Stored the product was successfully");
		System.out.println("Avilable product Quantity is : " + productQuantity);
		this.notify();
	}

	public synchronized void purchase(int quantity) {
		while (productQuantity < quantity) {
			System.out.println("Out of stock !!! Please wait for some time");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			productQuantity -= quantity;
			System.out.println("Purchase successfully\nAvilable product Quantity is : " + productQuantity);

		}
	
}
