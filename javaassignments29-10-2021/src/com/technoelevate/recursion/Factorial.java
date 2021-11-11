package com.technoelevate.recursion;

public class Factorial {
	private int fact = 1;

	public int factorial(int x) {
		if (x > 0) {
			fact = fact * x;
			x--;
			factorial(x);
		}
		return fact;
	}

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.println("Factorial of given number is : " + factorial.factorial(5));
	}
}