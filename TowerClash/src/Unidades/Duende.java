package Unidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Mapa.Mapa;

public class Duende extends EnemigoCerca {

	public Duende(int x, int y) {
		super(x, y, 100, 20, 4, 50);
		icono = new ImageIcon(this.getClass().getResource("/images/enemigos/duende.png"));
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
		agregarPW();
	}
}