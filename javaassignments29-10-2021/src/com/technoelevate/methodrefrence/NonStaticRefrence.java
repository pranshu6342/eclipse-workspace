package com.technoelevate.methodrefrence;

public class NonStaticRefrence {
	public void sheat() {
		System.out.println("Total number of sheat's : 80");
	}

	public void bus_No() {
		System.out.println("Bus number is : MP-19-CX-9752");
	}

	public static void main(String[] args) {
		Ibus ibus = StaticMethodRefrence::bus_No;
		ibus.busNo();
		NonStaticRefrence nonStaticRefrence = new NonStaticRefrence();
		ibus = nonStaticRefrence::sheat;
		nonStaticRefrence.sheat();
	}
}