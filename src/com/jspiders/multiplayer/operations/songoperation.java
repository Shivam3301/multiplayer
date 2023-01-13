package com.jspiders.multiplayer.operations;
import com.jspiders.multiplayer.entity.Song;
import java.util.ArrayList;
import java.util.Scanner;


public class songoperation {
	Scanner sc = new Scanner(System.in);

	ArrayList<Song> songsList=new ArrayList<>();

	public void addSongs() {
		 
		System.out.println("How many songs you want to add?");
		int count = sc.nextInt();
		
		for (int i = 1; i<= count; i++) {
			
			Song song = new Song();

			System.out.println("Enter the Song Id:");
			int id = sc.nextInt();
			song.setId(id);

			System.out.println("Enter the Song Name:");
			String songName = sc.next();
			song.setSongName(songName);

			System.out.println("Enter the Singer Name:");
			String singerName = sc.next();
			song.setSingerName(singerName);

			System.out.println("Enter the Movie Name:");
			String movieName = sc.next();
			song.setMovieName(movieName);

			System.out.println("Enter the composer of song:");
			String composer = sc.next();
			song.setComposer(composer);

			System.out.println("Enter the lyricist of song:");
			String lyricist = sc.next();
			song.setLyricist(lyricist);

			System.out.println("Enter the song length:");
			String length = sc.next();
			song.setLength(length);

			songsList.add(song);
			
			System.out.println(song.getSongName() + " is Added to playlist Succefully.");
			
			System.out.println("\n--------------------------------------------------------");
		}
		
		System.out.println("Now Play the Song you want");
		chooseSongToPlay();
	}

	public void chooseSongToPlay() {

		if (songsList.isEmpty()) {
			System.out.println("Playlist is Empty...");
			addSongs();
		} else {
			System.out.println("Choose song ID to play.\n" + songsList);
			int songID = sc.nextInt() - 1;
			System.out.println(" " + songsList.get(songID) + " " + " is Playing Now....");
		}
	}

	public void playAllSongs() {
		for (int i = 0; i < songsList.size(); i++) {
			System.out.println(" " + songsList.get(i) + " " + " is Playing Now...");

			System.out.println("\n--------------------------------------------------------");

		}
	}

	public void playRandomSong() {
		int n = (int) Math.random();
		for (int i = n; i < songsList.size(); i++) {
			System.out.println(" " + songsList.get(i) + " " + " is Playing Now...");

			System.out.println("\n--------------------------------------------------------");
		}
	}

	public void removeSong() {
		System.out.println("Choose song ID to remove \n" + songsList);

		int songID = sc.nextInt() - 1;

		System.out.println(" " + songsList.remove(songID) + " " + " is Removed Succesfully");

		System.out.println("\n--------------------------------------------------------");
	}

	public void editSong() {
		if (songsList.isEmpty()) {
			System.out.println("Playlist is Empty...");
			addSongs();
		} else {
			System.out.println("Choose song ID to Edit.\n" + songsList);
			int sID = sc.nextInt() - 1;
			System.out.println(" " + songsList.get(sID) + " " + " is Playing Now....");
		}
	}
}


