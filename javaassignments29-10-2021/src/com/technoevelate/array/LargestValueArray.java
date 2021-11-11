package com.technoevelate.array;

public class LargestValueArray {
	public static void main(String[] args) {
		int temp;
		int[] arr = { 20, 30, 25, 35, -16, 60, -100,205 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		System.out.println("Largest element in given array is : " + arr[0]);
	}
}
