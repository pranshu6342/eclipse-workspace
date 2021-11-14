package com.technoelevate.stringprectice;

import java.util.Scanner;

public class CharacterIndex {

	char[] c = new char[100];

	public void text(String s) {
		// System.out.println( s.codePointAt(1));
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}
	}

	public void find(char x) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] == x) {
				System.out.println("the character " + x + " is " + i + " position");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CharacterIndex characterIndex = new CharacterIndex();
		System.out.println("Enter Text...");
		String s = sc.nextLine();
		System.out.println("Enter Charater...");
		char c = sc.next().charAt(0);
		characterIndex.text(s);
		characterIndex.find(c);
	}
}
