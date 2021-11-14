package com.technoelevate.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class InstanceOfTesting {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("aman");
		list.add("Rohan");
		list.add(45);
		list.add(3.5);
		list.add(-2);
		list.add(-1.2);
		list.add('d');
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Double) {
				list.remove(i);
			}
		}
		Object[] obj = new Object[list.size()];
		for (int i = 0; i < list.size(); i++) {
			obj[i] = list.get(i);
		}
		Arrays.sort(obj);
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}
}