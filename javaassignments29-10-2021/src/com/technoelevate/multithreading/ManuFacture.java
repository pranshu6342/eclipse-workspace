package com.technoelevate.multithreading;

public class ManuFacture extends Thread {
	Godown godown;
	int noOfProduct;

	public ManuFacture(Godown godown, int noOfProduct) {
		super();
		this.godown = godown;
		this.noOfProduct = noOfProduct;
	}

	@Override
	public void run() {
		godown.store(noOfProduct);
	}

}
