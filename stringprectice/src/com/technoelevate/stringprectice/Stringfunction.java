package com.technoelevate.stringprectice;

import java.util.ArrayList;
import java.util.List;

public class Stringfunction {

	public static void main(String[] args) {
		String str = "23456789077777777777777777777777777777776";
		int count;
		List<Character> list = new ArrayList<>();
		String[] s = new String[1];
		for (int i = 0; i < str.length(); i++) {
			count = i + 1;
			list.add(str.charAt(i));
			char c = list.get(i);
			if (count % 2 == 0) {
				s[0] = Character.toString(c) + "-";
			} else {
				count++;
				s[0] = Character.toString(c);
			}

			System.out.print(s[0]);

			// System.out.print(list.get(i)+" ");

		}
	}
}
