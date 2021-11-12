package com.technoelevate.collection;

import java.util.ArrayList;

public class PalindromeString {
	public static void main(String[] args) throws InterruptedException {
		String name = "radar";
		ArrayList<Character> orinalValue = new ArrayList<>(2);
		ArrayList<Character> reverseValue = new ArrayList<>(2);
		for (int i = 0; i < name.length(); i++) {
			orinalValue.add(name.charAt(i));
		}
		for (int i = name.length() - 1; i >= 0; i--) {
			reverseValue.add(name.charAt(i));
		}
		for (int i = 0; i < orinalValue.size(); i++) {
			if (orinalValue.get(i).equals(reverseValue.get(i))) {
				System.out.println("Checking...");
				Thread.sleep(3000);
				System.out.println(name + " is polidrum");
				break;
			} else {
				System.out.println("Checking...");
				Thread.sleep(3000);
				System.out.println(name + " is not polidrum");
				break;
			}
		}
	}

}
