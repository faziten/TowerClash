package Unidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Disparos.DisparoArquera;
import Mapa.Jugador;
import Mapa.Mapa;

public class Arquera extends Aliado{

	public Arquera(int x, int y) {
		super(x, y, 150, 20, 6, 30);
		icono = new ImageIcon(this.getClass().getResource("/images/unidades/arquera.png"));
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
		agregarPW();
	}

	protected void crearDisparo() {
		if (miPWTiempo!=null) {
			Jugador.getInstance().crearDisparo(new DisparoArquera(x, y, miPWTiempo.getDaño(daño), miPWTiempo.getVelocidad(velocidad)));
		}
		else {
			Jugador.getInstance().crearDisparo(new DisparoArquera(x, y, daño, velocidad));
		}	
	}
	
	
	
}
