package audio;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class MusicPlayer {
	public static void main(String[] args) {
		System.out.println("start");
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
				play("CB_Drum");
			}
			if (c == 2) {
				play("CB_Drum");
			}
			if (c == 3) {
				play("CB_Drum");
			}
			if (c == 4) {
				play("CB_Drum");
			}
		} while (c != 6);
		sc.close();
	}

	public static void play(String instrument) {
		try {
			AudioClip clip = Applet.newAudioClip(new URL("file:///C:/Users/tesht/workspace//HackNJIT/src/audio/" + instrument + ".wav"));
			clip.play();
		} catch (MalformedURLException murle) {
			System.out.println(murle);
		}
	}
}
