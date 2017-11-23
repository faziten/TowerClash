package Unidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Disparos.DisparoCaballero;
import Mapa.Jugador;
import Mapa.Mapa;

public class Caballero extends Aliado {
	
	public Caballero(int x, int y) {
		super(x, y, 50, 10, 8, 30);
		icono = new ImageIcon(this.getClass().getResource("/images/unidades/caballero.png"));
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
		agregarPW();
		
	}
	
	protected void crearDisparo() {
		if (miPWTiempo!=null) {
			Jugador.getInstance().crearDisparo(new DisparoCaballero(x, y, miPWTiempo.getDaño(daño), miPWTiempo.getVelocidad(velocidad)));
		}
		else {
			Jugador.getInstance().crearDisparo(new DisparoCaballero(x, y, daño, velocidad));
		}	
	}
}