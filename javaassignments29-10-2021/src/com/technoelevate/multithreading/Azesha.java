package com.technoelevate.multithreading;

import java.util.ArrayList;

public class Azesha extends Thread {
	@Override
	public void run() {
		Board.read();
		System.out.println("I have done writing...");
	}

}
