package com.technoelevate.multiplayer;

import java.util.*;

public class MultiplayerOperation {
	List<Songs> songs = new ArrayList<>();
	private int index;
	Scanner sc = new Scanner(System.in);

	public void addSongs(String songs) {
		double d = Math.random();
		int min = (int) (d * 10);
		double d1 = Math.random();
		int sec = (int) (d1 * 60);
		String duration = min + ":" + sec;
		Songs songs2 = new Songs(songs, duration);
		this.songs.add(songs2);
	}

	public void selectSongs() {
		System.out.println("List of all songs!!");
		for (int i = 0; i < songs.size(); i++) {
			index = i + 1;
			System.out.println(index + " : " + songs.get(i));
		}
		System.out.println("Please select song you want to play!!");
		index = sc.nextInt();
		System.out.println(songs.get(index) + " is playing...");
	}

	public void deleteSongs() {
		for (int i = 0; i < songs.size(); i++) {
			index = i + 1;
			System.out.println("List of all songs!!\n" + index + " : " + songs.get(i));
		}
		System.out.println("Please select song you want to delete!!");
		index = sc.nextInt();
		songs.remove(index);
	}

	public void playRandom() {
		double d = Math.random();
		index = (int) (d * 10);
		System.out.println(songs.get(index) + " song is playing...");
	}

	public void searchSong() {
		System.out.println("please enter song name!!");
		String songName = sc.nextLine();
		if (songs.contains(songName)) {
			System.out.println(songName + " is playing...");
		} else {
			System.out.println(songName + " is not present in playlist");
		}
	}
}