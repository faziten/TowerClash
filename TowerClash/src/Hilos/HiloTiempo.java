package Hilos;

import Mapa.Jugador;
import Objeto.Objeto;

public class HiloTiempo extends Thread {

	private Objeto obj;
	private int segundos;

	public HiloTiempo(Objeto o, int seg) {
		obj = o;
		this.segundos = seg;
	}
	
	public void run() {
		int contador = 0;
		while (contador<segundos) {
			try {
				Thread.sleep(1000);
				contador++;				
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Jugador.getInstance().eliminarObjeto(obj);
	}
	
}
