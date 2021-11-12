package com.technoelevate.multithreading;

public class BiryaniStock extends Thread {
	Home home;
	int quantityOfProduct;

	public BiryaniStock(Home home, int quantityOfProduct) {
		super();
		this.home = home;
		this.quantityOfProduct = quantityOfProduct;
	}

	@Override
	public void run() {
		home.store(quantityOfProduct);
	}

}
