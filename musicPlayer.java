import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.util.Scanner;
import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Clip;

public class musicPlayer{

	static int fun = 1;
	
	public static void main(String[] args)
	{
		
		System.out.println("Welcome to the Java music player!");
		
		while(fun==1)
		{
		
			Scanner what = new Scanner(System.in);
		
			System.out.println("Choose an option.");
			System.out.println("1. Play a song.");
			System.out.println("2. See a list of songs.");
			System.out.println("3. Turn off audio player.");
			int decide = what.nextInt();
					if(decide==1)
							{
								fun = 2;
								playSound();
							}
					else if(decide==2)
							{
								fun = 3;
								soundtrack();
								fun = 1;
							}	
					else if(decide==3)
								{
									System.out.println("Shutting down.");
									fun = 0;
								}
					else
						{
							System.out.println("Choose another number.");
						}
			what.close();
						
		}
		
	}
	
	static void playSound()
		{
			try
			{	
					System.out.println("Choose a song");	
					System.out.println("1. Last Surprise");
					System.out.println("2. Rivers in the Desert");
					System.out.println("3. Beneath the Mask");
					System.out.println("4. Tokyo Daylight");
					System.out.println("5. The Whims of Fate");
					System.out.println("6. Gangsta Gangsta by N.W.A.");
					System.out.println("7. It Feels Good");
					Scanner play = new Scanner(System.in);
					int choice = play.nextInt();	
					// NOTE: THIS IS WHERE TO PUT THE .OGG FILES
					File soundFile = new File("Shoji_Meguro_feat_Lyn_-_Last_Surprise_mp3_pm_.wav");
					File soundFile2 = new File("Persona-5-OST-100-Rivers-In-the-Desert.wav");
					File soundFile3 = new File("Persona_5_OST_29_-_Beneath_the_Mask_MP3orMP4_com_-.wav");
					File soundFile4 = new File("Persona-5-OST-37-Tokyo-Daylight.wav");
					File soundFile5 = new File("Persona_5_-_The_Whims_Of_Fate_mp3_pm_.wav");
					File soundFile6 = new File("N.W.A.-Gangsta-Gangsta-_Mp3goo.io_.wav");
					File soundFile7 = new File("Rick and Morty - It Feels Good Loop.wav");
					
					if(choice==1)	
						{
					      AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
					      Clip test = AudioSystem.getClip();
						  test.open(ais);
						  test.start();
						  test.drain();
						  if(test.isActive() || test.isRunning())
							{
								test.stop();
								test.flush();
							}
						  fun = 1; 
						}
						
					if(choice==2)
						{
						  AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile2);
						  Clip test = AudioSystem.getClip();
						  test.open(ais);
						  test.start();
						  test.drain();
						  if(test.isActive() || test.isRunning())
							{
								test.stop();
								test.flush();
							}
						  fun = 1;
						}
						
					if(choice==3)
						{
						  AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile3);
						  Clip test = AudioSystem.getClip();
						  test.open(ais);
						  test.start();
						  test.drain();
						  if(test.isActive() || test.isRunning())
							{
								test.stop();
								test.flush();
							}
						  fun = 1;
						}
				
					if(choice==4)
						{
						  AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile4);
						  Clip test = AudioSystem.getClip();
						  test.open(ais);
						  test.start();
						  test.drain();
						  if(test.isActive() || test.isRunning())
							{
								test.stop();
								test.flush();
							}
						  fun = 1;
						}
					
					if(choice==5)
						{
						  AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile5);
						  Clip test = AudioSystem.getClip();
						  test.open(ais);
						  test.start();
						  test.drain();
						  if(test.isActive() || test.isRunning())
							{
								test.stop();
								test.flush();
							}
						  fun = 1;
						}
					
					if(choice==6)
						{
						  AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile6);
						  Clip test = AudioSystem.getClip();
						  test.open(ais);
						  test.start();
						  test.drain();
						  if(test.isActive() || test.isRunning())
							{
								test.stop();
								test.flush();
							}
						  fun = 1;
						}
					if(choice==7)
						{
						  AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile7);
						  Clip test = AudioSystem.getClip();
						  test.open(ais);
						  test.start();
						  test.drain();
						  if(test.isActive() || test.isRunning())
							{
								test.stop();
								test.flush();
							}
						  fun = 1;
						}
						
				    else
						{
							System.out.println("Choose a number on the list.");
							fun = 1;
						}				
					
			}catch(Exception e)
			{
				System.out.println("No song.");
			}
				
		}

	static void soundtrack()
	{
		String[] music = {"Last Surprise", "Rivers in the Desert", "Beneath the Mask", "Tokyo Daylight", "The Whims of Fate", "Gangsta Gangsta by N.W.A.", "It Feels Good"};
		System.out.println("Here is the list of songs in this Java program.");
		for(int i = 0; i<music.length; i++)
		{
			System.out.println(music[i]);
		}	
	}
	
}