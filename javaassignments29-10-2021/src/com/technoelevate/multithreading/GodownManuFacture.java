package com.technoelevate.multithreading;

public class GodownManuFacture {
	public static void main(String[] args) {
		Godown godown = new Godown(100);
		new Customer(godown, 80).start();
		new Customer(godown, 50).start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new ManuFacture(godown, 50).start();
	}

}
