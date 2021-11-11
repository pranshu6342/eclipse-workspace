package com.technoevelate.array;

import java.util.Arrays;

public class StringSorting {
	public static void main(String[] args) {
		String str[] = { "Java", " Python", " PHP", " C#", " C Programming", " C++" };

		for (int i = 0; i < str.length - 1; i++) {
			for (int j = i + 1; j < str.length; j++) {
				// compares each elements of the array to all the remaining elements
				if (str[i].compareTo(str[j]) > 0) {
					// swapping array elements
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		// prints the sorted array in ascending order
		System.out.println(Arrays.toString(str));

	}
}
