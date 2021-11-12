package com.technoelevate.multithreading;

import java.util.ArrayList;

public class Board {
	static ArrayList list = new ArrayList(0);

	public static synchronized void write() {
		list.add(
				"Each process has an address in memory. In other words, each process allocates a separate memory area.\r\n"
						+ "A process is heavyweight.\r\n" + "Cost of communication between the process is high.\r\n"
						+ "Switching from one process to another requires some time for saving and loading registers, memory maps, updating lists, etc.");
	}

	public static synchronized void read() {
		System.out.println(list.get(0));
	}

	public static synchronized void remove() {
		list.remove(0);
	}

}
