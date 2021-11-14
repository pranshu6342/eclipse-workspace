package com.technoelevate.parkingmanagmentsystem;

import java.util.HashMap;

public class ParkingLot {
	int amount = 0;
	private double area = 1000;
	private int lastTokenNo = 0;
	private HashMap<Integer, Roadvechicles> map = new HashMap<>();

	public Token comesIn(Roadvechicles rv) throws InsuficientSaceException {
		if (rv.space() < area) {
			lastTokenNo++;
			map.put(lastTokenNo, rv);
			area = area - rv.space();
			Token token = new Token(lastTokenNo);
			return token;
		}
		throw new InsuficientSaceException();

	}

	public Roadvechicles goesOut(Token token) throws InsuficientAmountException {
		int tokenNo = token.getToken();
		Roadvechicles rv = map.get(tokenNo);
		if (rv instanceof TwoWheel) {
			amount = 20;
		} else if (rv instanceof fourWheel) {
			amount = 40;
		} else if (rv instanceof Amphibian) {
			amount = 60;
		}
		if (token.getAmount() == amount) {
			area = area + rv.space();
			return rv;
		} else {
			throw new InsuficientAmountException();
		}

	}

	public double size() {
		return area;
	}
}
