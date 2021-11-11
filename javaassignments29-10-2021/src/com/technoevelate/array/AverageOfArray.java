package com.technoevelate.array;

public class AverageOfArray {
	public static void main(String[] args) {
		double average = 0, sum = 0;
		int[] arr = { 20, 30, 25, 35, -16, 60, -100 };
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		average = sum / arr.length;
		System.out.println("Average of given array is : " + average);
	}
}
