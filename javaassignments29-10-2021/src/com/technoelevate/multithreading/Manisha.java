package com.technoelevate.multithreading;

public class Manisha extends Thread {
	@Override
	public void run() {
		Board.remove();
		System.out.println("I have done erasing...");
	}
}
