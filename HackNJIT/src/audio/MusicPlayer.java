package audio;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class MusicPlayer {
	public static void main(String[] args) {
		
		try {
			AudioClip clip = Applet.newAudioClip(new URL("file:///C:/Users/tesht/workspace//HackNJIT/src/audio/CB_Kick.wav"));
			clip.play();
		} catch (MalformedURLException murle) {
			System.out.println(murle);
		}
		System.out.println("start");
		player("CB_Clap");
		Guesture();
		System.out.println("stop");
	}

	public static void Guesture() {
		Scanner sc = new Scanner(System.in);
		int c;
		do {

			c = sc.nextInt();

			System.out.println(c);
			if (c == 1) {
				player("CB_Drum");
			}
			if (c == 2) {
				player("CB_Drum");
			}
			if (c == 3) {
				player("CB_Drum");
			}
			if (c == 4) {
				player("CB_Drum");
			}
		} while (c != 6);
		sc.close();
	}

	public static void player(String instrument) {
		try {
			AudioClip clip = Applet.newAudioClip(new URL("file:///C:/Users/tesht/Documents/GitHub/airbuddies/HackNJIT/" + instrument + ".wav"));
			clip.play();
		} catch (MalformedURLException murle) {
			System.out.println(murle);
		}
	}
}
