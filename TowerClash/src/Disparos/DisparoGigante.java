package Disparos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Mapa.Mapa;

public class DisparoGigante extends DisparoEnemigo {

	public DisparoGigante(int x, int y, float da�o, int velocidad) {
		super(x, y, da�o, velocidad);
		icono = new ImageIcon(this.getClass().getResource("/images/disparos/DGigante.png"));
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
	}
	
}
