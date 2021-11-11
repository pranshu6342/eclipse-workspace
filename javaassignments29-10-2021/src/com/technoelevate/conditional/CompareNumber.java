package com.technoelevate.conditional;

import java.util.Scanner;

public class CompareNumber {
	public void printEqual(int x, int y, int z) {
		if (x < 0 || y < 0 || z < 0) {
			System.out.println("Invalid Value");
		} else if (x == y && y == z) {
			System.out.println("All numbers are equal");
		} else if (x != y && y != z) {
			System.out.println("All numbers are different");
		} else {
			System.out.println("Neither all are equal or different");
		}
	}

	public static void main(String[] args) {
		CompareNumber compareNumbers = new CompareNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("please frist enter number");
		int x = sc.nextInt();
		System.out.println("please second enter number");
		int y = sc.nextInt();
		System.out.println("please third enter number");
		int z = sc.nextInt();
		compareNumbers.printEqual(x, y, z);

	}
}
