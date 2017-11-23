package Hilos;

import Mapa.Jugador;
import Unidades.Unidad;

public class HiloPowerUp extends Thread{
	private int s;
	private Unidad uni;

	public HiloPowerUp(int seg) {
		s = seg*1000;
	}

	public HiloPowerUp(int seg, Unidad u) {
		this(seg);
		uni = u;
	}

	public void run() {
		try {
			Thread.sleep(s);
			if (uni!=null) {
				uni.setPW(null);
			}
			else {
				Jugador.getInstance().setPowerup(null);
			}			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
