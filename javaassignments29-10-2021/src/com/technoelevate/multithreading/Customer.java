package com.technoelevate.multithreading;

public class Customer extends Thread {
	Godown godown;
	int noOfProduct;

	public Customer(Godown godown, int noOfProduct) {
		super();
		this.godown = godown;
		this.noOfProduct = noOfProduct;
	}

	@Override
	public void run() {
		godown.purchase(noOfProduct);
	}
}
