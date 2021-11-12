package com.technoelevate.arrays;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class ArraysTesting {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("NITISH", "ABHINASH", "ROHAN", "SACHIN", "MANISHA");
		System.out.println("Given Object present in list : " + str.contains("ROHAN"));
		System.out.println();
		System.out.println("------------Iterating by passing lambda expression--------------");
		str.forEach(check -> System.out.println(check));
	}
}
