package com.technoelevate.multithreading;

import java.util.ArrayList;

public class Krishna extends Thread {

	@Override
	public void run() {
		Board.write();
		System.out.println("I have done writing...");
	}
}
