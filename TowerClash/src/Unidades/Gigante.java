package Unidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparos.DisparoGigante;
import Mapa.Jugador;
import Mapa.Mapa;

public class Gigante extends EnemigoLejos {

	public Gigante(int x, int y) {
		super(x, y, 50, 10, 4, 20, 3);
		icono = new ImageIcon(this.getClass().getResource("/images/enemigos/gigante.png"));
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
		tiempo = 0;
		agregarPW();
	}
	
	protected void crearDisparo() {
		if (miPWTiempo!=null) {
			Jugador.getInstance().crearDisparo(new DisparoGigante(x, y, miPWTiempo.getDaño(daño), miPWTiempo.getVelocidad(velocidad*2)));
		}
		else {
			Jugador.getInstance().crearDisparo(new DisparoGigante(x, y, daño, velocidad*2));
		}
		
	}
}
