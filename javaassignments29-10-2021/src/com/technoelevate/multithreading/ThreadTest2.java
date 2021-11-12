package com.technoelevate.multithreading;

public class ThreadTest2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Second thread run method");
		}
		super.run();
	}

}
