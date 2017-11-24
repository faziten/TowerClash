package Hilos;

import Mapa.Jugador;

public class HiloDisparos extends Thread {
	
	private boolean GameOver;

	public void GameOver() {
		GameOver = true;
	}
	
	public void run() {
		GameOver = false;
		while(!GameOver){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Jugador.getInstance().moverDisparos();
		}
	}
	
}

