package com.technoelevate.recursion;

import java.util.Scanner;

public class Table {
	int product, i = 1;

	public void table(int x) {
		while (i <= 10) {
			product = x * i;
			System.out.println(x + " * " + i + " = " + product);
			i++;
			table(x);
		}

	}

	public static void main(String[] args) {
		Table table = new Table();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number");
		int x = sc.nextInt();
		table.table(x);
	}
}
