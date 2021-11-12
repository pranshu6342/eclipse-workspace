package com.technoelevate.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorTesting {

	public static void main(String[] args) {
		List list = new LinkedList();
		list.add("Aman");
		list.add(90);
		list.add(12.4);
		list.add('c');
		Vector vector = new Vector();
		vector.addAll(list);
		vector.add(123);
		Object r = vector.capacity();
		System.out.println("Initial Capacity of vector " + r);
		vector.forEach(value -> {
			System.out.println(value);
		});
	}
}
