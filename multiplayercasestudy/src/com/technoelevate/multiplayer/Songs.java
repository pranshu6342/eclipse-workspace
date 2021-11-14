package com.technoelevate.multiplayer;

public class Songs {
	private String songsName;
	private String songsDuration;

	public Songs(String songsName, String songsDuration) {
		super();
		this.songsName = songsName;
		this.songsDuration = songsDuration;
	}

	public String getSongsName() {
		return songsName;
	}

	public String getSongsDuration() {
		return songsDuration;
	}

	@Override
	public String toString() {
		return songsName + " : " + songsDuration;
	}

}