package Unidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Mapa.Mapa;

public class Chispitas extends EnemigoCerca {

	public Chispitas(int x, int y) {
		super(x, y, 40, 10, 12, 15);
		icono = new ImageIcon(this.getClass().getResource("/images/enemigos/chispitas.png"));
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
		agregarPW();
	}

}
