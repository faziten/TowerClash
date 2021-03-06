package PowerUp;

import javax.swing.ImageIcon;

import GUI.PwTiempo;
import Mapa.Mapa;

public class Curacion extends Tiempo {
	
	public Curacion(int x, int y) {
		super(x, y);
		icono = new ImageIcon(this.getClass().getResource("/images/powerup/curacion.png"));
		lbl = new PwTiempo(this, icono);
		lbl.addMouseListener(new UsarPWTiempo());
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
	}

	public float getDa�o(float da�o) {
		return da�o;
	}

	public int getVelocidad(int vel) {
		return vel;
	}

	public float recibirDa�o(float da�o) {
		return 0;
	}

}

