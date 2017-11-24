package Hilos;

import Mapa.Jugador;

public class HiloLago extends Thread {
	
public void run() {
	int contador = 0;
	while(contador<5){
		try {
			Thread.sleep(1000);
			contador++;
			Jugador.getInstance().hacerDañoEnemigos(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Jugador.getInstance().moverDisparos();
	}
}

}

