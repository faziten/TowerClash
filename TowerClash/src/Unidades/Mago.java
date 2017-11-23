package Unidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Disparos.DisparoMago;
import Mapa.Jugador;
import Mapa.Mapa;

public class Mago extends Aliado{

	public Mago(int x, int y) {
		super(x, y, 20, 30, 14, 50);
		icono = new ImageIcon(this.getClass().getResource("/images/unidades/mago.png"));
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
		agregarPW();
	}
	
	protected void crearDisparo() {
		if (miPWTiempo!=null) {
			Jugador.getInstance().crearDisparo(new DisparoMago(x, y, miPWTiempo.getDaño(daño), miPWTiempo
				.getVelocidad(velocidad)));
		}
		else {
			Jugador.getInstance().crearDisparo(new DisparoMago(x, y, daño, velocidad));
		}	
	}
	
}
