package PowerUp;

import javax.swing.ImageIcon;

import GUI.pwAccion;
import Mapa.Jugador;
import Mapa.Mapa;

public class Congelar extends Accion {

	public Congelar(int x, int y) {
		super(x, y);
		icono = new ImageIcon(this.getClass().getResource("/images/powerup/congelar.png"));
		lbl = new pwAccion(this, icono);
		lbl.addMouseListener(new UsarPWAccion());
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
	}
	
	public void efecto() {
		Jugador.getInstance().congelarEnemigos(5);
	}

}