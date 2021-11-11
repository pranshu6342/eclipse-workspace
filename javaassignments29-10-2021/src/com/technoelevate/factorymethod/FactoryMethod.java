package com.technoelevate.factorymethod;

import java.util.Scanner;

public class FactoryMethod {

	public void start(String name) {
		if (name.equalsIgnoreCase("Nidarshan")) {
			System.out.println("Intesting personality Man");
		} else if (name.equalsIgnoreCase("Dhananjay")) {
			System.out.println("Cool boy");
		} else if (name.equalsIgnoreCase("Nitish")) {
			System.out.println("Motivated Person");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter name your colleagues");
		String option = sc.next();
		FactoryMethod factoryMethod = new FactoryMethod();
		factoryMethod.start(option);
	}
}
