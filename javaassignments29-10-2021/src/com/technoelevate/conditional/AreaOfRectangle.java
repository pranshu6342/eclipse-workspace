package com.technoelevate.conditional;

public class AreaOfRectangle {
	private double area;

	public double area(double radius) {
		if (radius < 0) {
			area = -1.0;
		} else {
			area = 3.14 * (radius * radius);
		}
		return area;
	}

	public double area(double x, double y) {
		if (x < 0 || y < 0) {
			area = -1.0;
		} else {
			area = x * y;
		}
		return area;
	}

	public static void main(String[] args) {
		AreaOfRectangle areaOfRectangle = new AreaOfRectangle();
		System.out.println(areaOfRectangle.area(4));
		System.out.println(areaOfRectangle.area(3.2, 2));
	}
}
