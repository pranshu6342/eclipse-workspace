package com.technoelevate.multiplayer;

import java.util.Scanner;

public class Multiplayer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choise;
		MultiplayerOperation operation = new MultiplayerOperation();
		while (true) {
			System.out.println("1.play song's     (2)Add/Delete song's     (3)Exit");
			choise = sc.nextInt();
			switch (choise) {
			case 1:
				System.out.println("(1)Play all song's  (2)Play random song's  (3)Select Song");
				choise = sc.nextInt();
				switch (choise) {
				case 1:
					System.out.println("Song's playing...");
					break;
				case 2:
					operation.playRandom();
					break;
				case 3:
					operation.selectSongs();
					break;
				}
				break;
			case 2:
				System.out.println("(1)Add Song's   (2)Delete Song's");
				choise = sc.nextInt();
				switch (choise) {
				case 1:
					System.out.println("How many song's you want to add");
					choise = sc.nextInt();
					System.out.println("Please enter song's name");
					for (int i = 1; i <= choise; i++) {

						String name = sc.next();
						operation.addSongs(name);
					}
					System.out.println("song's added successfully to playlist!!");
					break;
				case 2:
					operation.deleteSongs();
					break;

				}
				break;
			case 3:
				System.exit(0);
			}
		}
	}
}