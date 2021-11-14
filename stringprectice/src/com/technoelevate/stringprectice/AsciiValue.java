package com.technoelevate.stringprectice;

public class AsciiValue {
	public static void main(String[] args) {
		String str = "ABC";
		for (int i = 0; i < str.length(); i++) {
			int asciiValue = str.charAt(i);
			System.out.println(str.charAt(i) + "=" + asciiValue);
		}
	}
}
