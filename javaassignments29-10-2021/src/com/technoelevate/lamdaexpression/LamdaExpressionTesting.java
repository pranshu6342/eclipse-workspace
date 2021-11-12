package com.technoelevate.lamdaexpression;

public class LamdaExpressionTesting {
	public static void main(String[] args) {
		Icream icream = () -> {
			System.out.println("Name of Icream is Breville");
		};
		icream.name();
		IcreamPrice icreamPrice = (int x) -> {
			return x * 25;
		};
		int x = icreamPrice.price(5);
		System.out.println("Price of Icream is : " + x);
	}
}
