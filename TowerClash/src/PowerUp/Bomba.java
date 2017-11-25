package PowerUp;

import javax.swing.ImageIcon;

import GUI.pwAccion;
import Mapa.Jugador;
import Mapa.Mapa;

public class Bomba extends Accion {

	public Bomba(int x, int y) {
		super(x, y);
		icono = new ImageIcon(this.getClass().getResource("/images/powerup/cohete.png"));
		lbl = new pwAccion(this, icono);
		lbl.addMouseListener(new UsarPWAccion());
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
	}
	
	public void efecto() {
		Jugador.getInstance().eliminarEnemigos(y);
	}

}
