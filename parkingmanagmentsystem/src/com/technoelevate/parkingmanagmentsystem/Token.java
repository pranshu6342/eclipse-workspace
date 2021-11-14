package com.technoelevate.parkingmanagmentsystem;

public class Token {
	private int token;
	private int amount;

	public Token(int token) {
		this.token = token;
	}

	public Token(int token, int amount) {
		this.token = token;
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public int getToken() {
		return token;
	}
}
