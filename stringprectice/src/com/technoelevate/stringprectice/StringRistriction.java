package com.technoelevate.stringprectice;

import java.util.ArrayList;
import java.util.Scanner;

public class StringRistriction {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter Somthing...");
		String str = sc.nextLine();
		ArrayList<Character> list = new ArrayList<Character>();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (count == 5) {
				System.out.println("you can not hold more than 5 word's");
				break;
			}
			else if (str.charAt(i) == ' ') {
				count++;
				list.add(str.charAt(i));
			} else {
				list.add(str.charAt(i));
			}
		}
	}
}
