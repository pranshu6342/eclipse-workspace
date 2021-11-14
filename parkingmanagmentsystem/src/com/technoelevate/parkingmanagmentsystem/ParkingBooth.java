package com.technoelevate.parkingmanagmentsystem;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ParkingBooth {
	private static String tab = "\t\t";

	public static void main(String[] args) throws InsuficientSaceException, InsuficientAmountException {
		Scanner sc = new Scanner(System.in);
		ParkingLot p = new ParkingLot();
		Token token = null;
		LocalDateTime dateTime=LocalDateTime.now();
		while (true) {
			System.out.println("(a)Vachel Entry" + tab + "(b)Vachel Exit" + tab + "(c)Check parking space");
			char park = sc.next().charAt(0);
			switch (park) {
			case 'a':
				System.out.println("enter vachel name");
				String vName = sc.next();
				if (vName.equalsIgnoreCase("activa")) {
					Activa activa = new Activa();
					token = p.comesIn(activa);
					System.out.println("token no : " + token.getToken() +" | "+dateTime+ " | amount : 20");
				}
				if (vName.equalsIgnoreCase("bullet")) {
					Bullet bullet = new Bullet();
					token = p.comesIn(bullet);
					System.out.println("token no : " + token.getToken() +" | "+dateTime+  " | amount : 20");
				}
				if (vName.equalsIgnoreCase("nano")) {
					nano nano = new nano();
					token = p.comesIn(nano);
					System.out.println("token no : " + token.getToken() +" | "+dateTime+  " | amount : 40");
				}
				if (vName.equalsIgnoreCase("inova")) {
					Inova inova = new Inova();
					token = p.comesIn(inova);
					System.out.println("token no : " + token.getToken() +" | "+dateTime+  " | amount : 40");
				}
				if (vName.equalsIgnoreCase("amphibian")) {
					Amphibian amphibian = new Amphibian();
					token = p.comesIn(amphibian);
					System.out.println("token no : " + token.getToken() +" | "+dateTime+  " | amount : 60");
				}
				break;
			case 'b':
				System.out.println("Enter Token no");
				int token2 = sc.nextInt();
				System.out.println("Enter Amount");
				int amount = sc.nextInt();
				Token token1 = new Token(token2, amount);
				try {
					Roadvechicles t = p.goesOut(token1);
					System.out.println("Thank's for visiting TechnoEvelate...");
				} catch (InsuficientAmountException e) {
					System.out.println("Please pay valid amount");
				}
				break;
			case 'c':
				System.out.println("available space in parkingLot " + p.size());
				break;
			}
		}
	}
}
