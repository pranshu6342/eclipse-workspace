package com.technoelevate.conditional;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		int[] arr = new int[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number");
		for (int i = 0; i < 20; i++) {
			int x = sc.nextInt();
			arr[i] = x;
		}

		for (int i = 0; i < 20; i++) {
			if (arr[i] == 0) {
				System.out.println("your entered number is : " + arr[i]);
			} else if (arr[i] > 0) {
				if (arr[i] % 2 == 0) {
					System.out.println(arr[i] + " : is possitive number");
				} else {
					System.out.println(arr[i] + " : is odd number");
				}
			} else if (arr[i] < 0) {
				System.out.println(arr[i] + " : is negative number");
			}
		}
	}

}
