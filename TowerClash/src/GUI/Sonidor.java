package GUI;

import java.awt.Image;
import java.util.HashMap;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Sonidor {
	private static final String path="/audio/";
	private static final String ext=".mp3";
	private static HashMap<String, Player> mapeo=new HashMap<String, Player>(); //Los Sonidos son hallados por su clave.
	
	
	private static Player grass_footstep;
	private static Player soundtrack;
	
	public Sonidor(){
		try {
			Player grass_footstep=new Player(getClass().getResourceAsStream(path+"grass_footstep"+ext));
			mapeo.put("grass_footstep", grass_footstep);
			Player soundtrack=new Player(getClass().getResourceAsStream(path+"soundtrack"+ext));
			mapeo.put("soundtrack", soundtrack);
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}
	}
	
	public static void playSound(String sound){
		new Thread(new Runnable() {
			  public void run() {
		try {
			mapeo.get(sound).play();
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}
			  }}).start();
		
	}

	
	////////////////////////////////EXAMPLE CODE///////////////////////////////
	/*
	private void sountrack(){
    	new Thread(new Runnable() {
			  public void run() {
				  try{
					  Player playMP3 = new Player(getClass().getResourceAsStream(path+"soundtrack"+ext)); //Acceso relativo para .JAR ejecutable.
					  playMP3.play();}
    	
				  catch(Exception exc){
					  exc.printStackTrace();
					  System.out.println("Failed to play the file.");}
			  }}).start();}
			  */
}
