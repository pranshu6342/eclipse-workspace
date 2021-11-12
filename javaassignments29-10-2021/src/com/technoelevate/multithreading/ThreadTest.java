package com.technoelevate.multithreading;

public class ThreadTest extends Thread {

	public static void main(String[] args) {
		ThreadTest2 test2 = new ThreadTest2();
		ThreadTest demo = new ThreadTest();
		demo.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main method statement running");

		}
		test2.start();
	}
}
//	@Override
//	public void run() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Run method statement running");
//		}
//		super.run();
//	}
