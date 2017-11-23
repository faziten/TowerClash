package Hilos;

import GUI.GUI;
import Mapa.*;
import Unidades.*;


public class HiloEnemigos extends Thread { 
	
	private boolean gameOver;
	
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
		int i=0;
		while(!gameOver){
			try {
			
				Thread.sleep(500);
				jugador.crearEnemigo();
				jugador.crearEnemigo();
				for(Enemigo ene: jugador.getEnemigos())
					GUI.Move(ene, i);
				/*Cada enemigo deberia tener su posicion especifica independiente
				 * para asi moverlo. Se hara en la re-entrega.
				 */
				i+=75;
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}