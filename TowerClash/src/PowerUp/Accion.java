package PowerUp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import GUI.pwAccion;
import Mapa.Jugador;

public abstract class Accion extends PowerUp {

	public Accion(int x, int y) {
		super(x, y);
	}

	public abstract void efecto();
	

	protected class UsarPWAccion extends MouseAdapter {
		
		public void mouseClicked(MouseEvent e) {
			pwAccion btn = (pwAccion) e.getSource();
			btn.getPW().efecto();
			Jugador.getInstance().eliminarPW(btn.getPW());
		}	
	}

}
