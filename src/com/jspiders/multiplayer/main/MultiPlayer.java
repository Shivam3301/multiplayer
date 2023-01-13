package com.jspiders.multiplayer.main;
import com.jspiders.multiplayer.operations.*;
import java.util.Scanner;

import com.jspiders.multiplayer.entity.Song;

	public class MultiPlayer {

		static songoperation songOperation = new songoperation();
		static boolean loop = true;
		private static Song song;

		public static void main(String[] args) {
			while (loop) {
				menu();
			}
		}

		private static Song menu() {
			System.out.println("***************MENU**************");
			System.out.println("\n Please Select Menu option:"
					+ "\n 1. ADD or REMOVE SONG"
					+ "\n 2. PLAY SONG"
					+ "\n 3. EDIT SONG"
					+ "\n 4. EXIT");
			
			
			try (Scanner sc = new Scanner(System.in)) {
				int choice = sc.nextInt();

				switch (choice) {
				case 1: {
					System.out.println("Please Select option:\n1. Add Song"
							+ "\n2. Remove Song");

					int option = sc.nextInt();
					switch (option) {
					case 1: {
						songOperation.addSongs();
						menu();
						break;
					}
					case 2: {
						songOperation.removeSong();
						menu();
						break;
					}
					default:
						throw new IllegalArgumentException("Invalide choice: " + choice);
					}
					break;
					}
	//-------------------------------------------------------------------------------------
				case 2: {
					System.out.println("Please Select option:\n1.Choose Song\n"
							+ "2.Play All Song\n"
							+ "3.Random Song\n"
							+ "4.Go Back ");

					int option = sc.nextInt();
					switch (option) {
					case 1: {
						songOperation.chooseSongToPlay();
						menu();
						break;
					}
					case 2: {
						songOperation.playAllSongs();
						menu();
						break;
					}
					case 3: {
						songOperation.playRandomSong();
						menu();
						break;
					}
					case 4: {
						System.out.println("Exit from Playlist.");
						menu();
						break;
					}
					default:
						throw new IllegalArgumentException("Unexpected value: " + option);
					}
					break;
				}

	//--------------------------------------------------------------------------------------------
				
//				case 3: {
//					songOperation.editSong();
//					loop = false;
//					break;
//				}
				
	//-----------------------------------------------------------------------------------------------			
				case 4: {
					System.out.println("Exit from Playlist...");
					menu();
					break;
				}
		
	//-------------------------------------------------------------------------------------------------			
				default:
					throw new IllegalArgumentException("Invalide choice " + choice);
				}
			}
			return song;
		}
	}

