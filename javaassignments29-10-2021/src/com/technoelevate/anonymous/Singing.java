package com.technoelevate.anonymous;

public class Singing {
	public static void main(String[] args) {
		Singer singer = new Singer() {

			@Override
			public void name() {
				System.out.println("MY name is Ranu Mandal");

			}

			@Override
			public int age() {
				// TODO Auto-generated method stub
				return 45;
			}
		};
		singer.name();
		System.out.println("My age is : " + singer.age());
		singer.dautherName();
		System.out.println("My dauther age is : " + singer.dautherAge());
	}
}
