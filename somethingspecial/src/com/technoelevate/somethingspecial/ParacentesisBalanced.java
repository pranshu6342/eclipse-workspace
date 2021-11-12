package com.technoelevate.somethingspecial;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class ParacentesisBalanced {
	private HashMap<Character, Character> map = new HashMap<>(5, 5);
	private Stack<Character> myStack = new Stack<>();
	private String symbol = "{}()<>[]";
	private boolean balanced = false;

	public void test(String value) {
		map.put('}', '{');
		map.put(']', '[');
		map.put(')', '(');
		map.put('>', '<');

		for (int i = 0; i < value.length(); i++) {
			char ch = value.charAt(i);
			if (symbol.contains(ch + "") && map.get(ch) == null) {
				myStack.push(ch);
			} else if (symbol.contains(ch + "") && map.get(ch) != null) {
				if (!myStack.isEmpty()) {
					char store = myStack.pop();
					if (store == map.get(ch)) {
						balanced = true;
					} else {
						balanced = false;
					}
				}
			} else {
				System.out.println("skipping...");
			}
		}
		if (balanced) {
			System.out.println("String is balanced...");
		} else {
			System.out.println("String is not balanced...");
		}
	}

	public static void main(String[] args) {

		ParacentesisBalanced balanced = new ParacentesisBalanced();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String including test symbols...");
		String input = sc.next();
		balanced.test(input);
	}

}
