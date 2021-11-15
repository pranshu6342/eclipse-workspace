package com.technoelevate.stringprectice;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;

public class Multiplayer {
	static List<String> list = new ArrayList<String>();

	public static void main(String[] args) {

		list.add("Song1");
		list.add("Song2");
		list.add("Song3");
		list.add("Song4");
		list.add("Song5");
		display();

	}

	public static void display() {
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Play a song\n2.Search for a song\n3.Operate on Multiplayer\n4.Exit");
		i = scanner.nextInt();
		switch (i) {
		case 1:
			System.out.println("Play a song");
			Multiplayer out = new Multiplayer();
			out.play();
			System.out.println("press(0)to Exit");
			int x=scanner.nextInt();
			if(x==0) {
				display();
			}
			break;
		case 2:
			System.out.println("Search for a song");
			Multiplayer out1 = new Multiplayer();
			out1.search();
			System.out.println("press(0)to Exit");
			int x1=scanner.nextInt();
			if(x1==0) {
				display();
			}
			break;
		case 3:
			System.out.println("Operate on Multiplayer");
			Multiplayer multiplayer = new Multiplayer();
			multiplayer.operation();
			System.out.println("press(0)to Exit");
			int x2=scanner.nextInt();
			if(x2==0) {
				display();
			}
			break;
		case 4:
			System.exit(0);
		default:
			System.out.println("Please enter a vaild input");
		}

	}

	public static void operation() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Add a song\n2.Delete a song");
		int i = scanner.nextInt();
		System.out.println("if u want to exit...");
		String t=scanner.next();
		if(t.equalsIgnoreCase("yes")) {
			System.out.println("press(0)to Exit");
			int x1=scanner.nextInt();
			if(x1==0) {
				display();
			}
		}
		
		switch (i) {
		case 1:
			System.out.println("Please Add a Song");
			Scanner scanner2 = new Scanner(System.in);
			String s = scanner2.nextLine();
			list.add(s);
			System.out.println("Updated song list: ");
			for (int k = 0; k < list.size(); k++) {
				System.out.println(list.get(k));
			}
			System.out.println("press(0)to Exit");
			int x2=scanner.nextInt();
			if(x2==0) {
				display();
			}
		case 2:
			System.out.println("Enter a song name to be deleted : ");
			Scanner scanner3 = new Scanner(System.in);
			String sc = scanner3.nextLine();
			for (int l = 0; l < list.size(); l++) {
				if (sc.contains(list.get(l))) {
					list.remove(l);
					System.out.println("Updated song list : ");
					for (int m = 0; m < list.size(); m++) {
						System.out.println(list.get(m));
					}
					break;
				} else if (i == list.size() - 1) {
					System.out.println("Song is not Present");
				}
			}
		}

	}

	public static void search() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Search for the song");
		String s = scanner.nextLine();
		for (int i = 0; i < list.size(); i++) {
			if (s.contains(list.get(i))) {
				System.out.println("Song is present");
				break;
			} else if (i == list.size() - 1) {
				System.out.println("Song is not Present");
			}
		}
	}

	public static void play() {
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Play all song\n2.Play a random song\n3.Play a perticular song\n4.Exit");
		i = scanner.nextInt();
		switch (i) {
		case 1:
			for (int j = 0; j < list.size(); j++) {
				System.out.println(list.get(j));
			}
			break;
		case 2:
			double d = Math.random();
			int random = (int) (d * list.size() );
			System.out.println(list.get(random) + " is playing..");
			break;
		case 3:
			System.out.println("Play a perticular song");
			for( i=0;i<list.size();i++) {
				System.out.println(i+1+" : "+list.get(i));
			}
			int q;
			q = scanner.nextInt();
			System.out.println(list.get(q - 1) + " is playing");
			break;
		case 4:
			display();
		default:
			System.out.println("Enter the valid input");
			break;
		}
	}
}