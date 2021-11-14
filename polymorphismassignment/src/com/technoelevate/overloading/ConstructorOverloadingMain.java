package com.technoelevate.overloading;

import java.util.Scanner;

public class ConstructorOverloadingMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name");
		String name = sc.nextLine();
		System.out.println("please enter your course");
		String course = sc.nextLine();
		System.out.println("would you registered you mobile no\nprees (1)if yes else press (0)");
		int x = sc.nextInt();
		if (x == 1) {
			System.out.print("please enter your contact number");
			long mob = sc.nextLong();
			Student student = new Student(name, mob, course);
			System.out.println("Name : " + student.getName());
			System.out.println("Mob : " + student.getMob());
			System.out.println("Course : " + student.getCourse());
		} else {
			Student student = new Student(name, course);
			System.out.println("Name : " + student.getName());
			System.out.println("Course : " + student.getCourse());
		}

	}
}
