package com.technoelevate.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDublicateChar {
	public static void main(String[] args) {

		Set<Character> set = new HashSet<Character>();
		String str = "akram";
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		System.out.println(set);
	}

}
