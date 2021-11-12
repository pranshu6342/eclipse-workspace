package com.technoelevate.multithreading;

public class Sheduler {
	public static void main(String[] args) {
		FreshLite_03_Java java = new FreshLite_03_Java();
		FreshLite_03_React react = new FreshLite_03_React();
		java.setPriority(7);
		Thread.currentThread().setPriority(5);
		react.setPriority(2);
		java.start();
		react.start();
		System.out.println(java.getName());
		System.out.println(java.getPriority());
		System.out.println(react.getName());
		System.out.println(react.getPriority());
		System.out.println("Hi everyone Welcome to TestYantra");
	}

}
