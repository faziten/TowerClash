package Unidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparos.DisparoValquiria;
import Mapa.Jugador;
import Mapa.Mapa;

public class Valquiria extends Aliado {

	public Valquiria(int x, int y) {
		super(x, y, 60, 15, 10, 40);
		icono = new ImageIcon(this.getClass().getResource("/images/unidades/valquiria.png"));
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
		agregarPW();
	}
	
	protected void crearDisparo() {
		if (miPWTiempo!=null) {
			Jugador.getInstance().crearDisparo(new DisparoValquiria(x, y, miPWTiempo.getDaño(daño), miPWTiempo.getVelocidad(velocidad)));
		}
		else {
			Jugador.getInstance().crearDisparo(new DisparoValquiria(x, y, daño, velocidad));
		}	
	}

}