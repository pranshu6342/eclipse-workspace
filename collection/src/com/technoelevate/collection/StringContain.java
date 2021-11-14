package com.technoelevate.collection;

import java.time.Instant;
import java.util.ArrayList;

public class StringContain extends Thread {
	public static void main(String[] args) {
		String num = "VVV";
		String value = "234";
		ArrayList<Integer> number = new ArrayList<>();
		ArrayList<Character> values = new ArrayList<>();

		for (int i = 0; i < num.length(); i++) {
			number.add((int) num.charAt(i));
		}
		for (int i = 0; i < value.length(); i++) {
			values.add(value.charAt(i));

		}
		for (int i = 0; i < number.size(); i++) {
			if (number.get(i) >= '0' && number.get(i) <= '9') {
				System.out.println(true);
				break;
			} else {
				System.out.println(false);
				break;
			}

		}
		System.out.println("++++++++++++++++++++++");
		for (int i = 0; i < values.size(); i++) {
			if (values.get(i) >= '0' && values.get(i) <= '9') {
				System.out.println(true);
				break;
			} else {
				System.out.println(false);
				break;
			}
		}
		
	}
}
