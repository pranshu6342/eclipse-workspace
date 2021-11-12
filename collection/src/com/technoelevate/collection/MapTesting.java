package com.technoelevate.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class MapTesting {
	private HashMap<Integer, String> map = new HashMap<>(5, 5);

	public void test() {
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");

		System.out.println(map.entrySet());
	}

	public static void main(String[] args) {
		MapTesting testing = new MapTesting();
		testing.test();
	}
}
