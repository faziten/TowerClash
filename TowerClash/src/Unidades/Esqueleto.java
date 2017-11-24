package Unidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Mapa.Mapa;

public class Esqueleto extends EnemigoCerca {

	public Esqueleto(int x, int y) {
		super(x, y, 250, 30, 2, 70);
		icono = new ImageIcon(this.getClass().getResource("/images/enemigos/esqueleto.png"));
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
		agregarPW();
	}
}
