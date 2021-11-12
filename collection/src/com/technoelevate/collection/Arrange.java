package com.technoelevate.collection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Arrange {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>(5, 3);

		map.put(101, "bhopal");
		map.put(102, "satna");
		map.put(103, "indore");

		for (Map.Entry entry : map.entrySet())
			System.out.println(entry.getKey() + ":" + entry.getValue());
	}
}
