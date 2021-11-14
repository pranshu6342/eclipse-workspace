package com.technoelevate.stringprectice;

public class StringPredefineFunction {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("234234987789654451");
		int offset = 2;
		int length = str.length();
		for (int i = 1; i < length / 2; i++) {
			str = str.insert(offset, "-");
			offset = offset + 3;
			// System.out.println(str);
		}
		System.out.println(str);
	}
}
