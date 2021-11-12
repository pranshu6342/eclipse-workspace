package com.technoelevate.methodrefrence;

public class StaticMethodRefrence {
	public static void sheat() {
		System.out.println("Total number of sheat's : 80");
	}

	public static void bus_No() {
		System.out.println("Bus number is : MP-19-CX-9752");
	}

	public StaticMethodRefrence() {
		System.out.println("Which constructor you are looking");
	}

	StaticMethodRefrence(int x) {
		System.out.println("Avilable Sheat's = 39");
	}

	public static void main(String[] args) {
		Ibus ibus = StaticMethodRefrence::bus_No;
		bus_No();
		Ibus ibus2 = StaticMethodRefrence::sheat;
		sheat();
		IConstructor constructor = StaticMethodRefrence::new;
		constructor.add(34);
	}
}
