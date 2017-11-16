package Hilos;

import Mapa.*;
import Unidades.*;

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
			
				Thread.sleep(500);
				Enemigo e= jugador.crearEnemigo();
				e.mover(e.getCelda());
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
