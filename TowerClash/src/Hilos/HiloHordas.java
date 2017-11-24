package Hilos;

import Mapa.Jugador;

public class HiloHordas extends Thread {

	private boolean GameOver;
	private int congelar;

	public void GameOver() {
		GameOver = true;
	}

	public void congelar(int seg) {
		congelar = seg;
	}
	
	public void run() {
		GameOver = false;
		int cont = 0;
		int oleada = 1;
		while(!GameOver) {
			try {
				if (congelar>0) {
					Thread.sleep(1000);
					congelar--;
				}
				else {
					Thread.sleep(3000/oleada);				
					cont += 3000/oleada/1000;
					Jugador.getInstance().crearEne();				
					if (cont>=30) {
						Thread.sleep(10000);					
						cont = 0;
						oleada++;
						if (oleada>3) {
							while (Jugador.getInstance().hayEnemigos()) {
								
							}	
							Jugador.getInstance().GameOver(true);
						}					
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
	
}

