package Hilos;

import Mapa.Jugador;

public class HiloEnemigos extends Thread { 
	
	private boolean gameOver;
	private int frozen;
	private Jugador jugador;

	public HiloEnemigos(Jugador j) {
		setName("HiloEnemigos");
		jugador=j;
	}

	public void gameOver() {
		gameOver = true;
	}
	
	public void run() {
		gameOver = false;
		while(!gameOver){
			try {
			
				Thread.sleep(125);
				jugador.crearEnemigo();
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
