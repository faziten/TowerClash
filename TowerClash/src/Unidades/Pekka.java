package Unidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Mapa.Mapa;

public class Pekka extends EnemigoCerca {	

	public Pekka(int x, int y) {
		super(x, y, 50, 10, 4, 20);
		icono = new ImageIcon(this.getClass().getResource("/images/enemigos/pekka.png"));
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
		agregarPW();
	}
}
