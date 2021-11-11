package com.technoevelate.array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter Latter's");
		String name = sc.next();
		char[] temp = name.toCharArray();
		boolean[] found = new boolean[200];
		StringBuilder sb = new StringBuilder();
		System.out.println("String with duplicates : " + name);
		for (char c : temp) {
			if (!found[c]) {
				found[c] = true;
				sb.append(c);
			}
		}
		System.out.println("String after duplicates removed : " + sb.toString());
	}
}
