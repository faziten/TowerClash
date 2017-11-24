package Unidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Mapa.Mapa;

public class Barbaro extends EnemigoCerca {

	public Barbaro(int x, int y) {
		super(x, y, 20, 5, 8, 10);
		icono = new ImageIcon(this.getClass().getResource("/images/enemigos/barbaro.png"));
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
		agregarPW();
	}

}