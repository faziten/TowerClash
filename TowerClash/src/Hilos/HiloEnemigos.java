package Hilos;

import Mapa.*;


public class HiloEnemigos extends Thread { 
	
	private boolean gameOver;
	private int congelar;
	
	public void gameOver() {
		gameOver = true;
	}
	
	public void congelar(int seg) {
		congelar = seg;
	}
	
	public void run() {
		gameOver = false;
		while(!gameOver){
			
				try {
					if (congelar>0) {
						Thread.sleep(1000);
						congelar--;
					}
					else {
						Thread.sleep(125);
						Jugador.getInstance().moverEnemigos();
					}				
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
		}
	}
}