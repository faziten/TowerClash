package PowerUp;

import javax.swing.ImageIcon;

import GUI.PwTiempo;
import Mapa.Mapa;

public class Furia extends Tiempo{

	public Furia(int x, int y) {
		super(x, y);
		icono = new ImageIcon(this.getClass().getResource("/images/powerup/furia.png"));
		lbl = new PwTiempo(this, icono);
		lbl.addMouseListener(new UsarPWTiempo());
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
	}
	public float getDaño(float daño) {
		return 0;
	}

	public int getVelocidad(int vel) {
		return 0;
	}

	public float recibirDaño(float daño) {
		return 0;
	}

}
