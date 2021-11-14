package com.technoelevate.overloading;

public class OverlaodingTestCase {

	int volume(int side) {
		return side * side * side;
	}

	int volume(int length, int breadth, int height) {
		return length * breadth * height;
	}

	double volume(int radius, int height) {
		return 3.14 * (radius * radius) * height / 3;
	}

	public static void main(String[] args) {
		OverlaodingTestCase testCase = new OverlaodingTestCase();
		System.out.println("Volume of Cube " + testCase.volume(10));
		System.out.println("Volume of Rectangular prism " + testCase.volume(10, 12, 30));
		System.out.println("Volume of Cone " + testCase.volume(5, 10));
	}
}
