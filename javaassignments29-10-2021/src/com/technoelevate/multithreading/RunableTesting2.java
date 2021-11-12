package com.technoelevate.multithreading;

public class RunableTesting2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Runnable2 thread running");
		}
	}

}