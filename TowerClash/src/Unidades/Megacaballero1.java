package Unidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Mapa.Mapa;

public class Megacaballero1 extends Megacaballero {	

	public Megacaballero1(int x, int y) {
		super(x, y, 50, 10, 8, 70);
		icono = new ImageIcon(this.getClass().getResource("/images/unidades/megacaballero1.png"));
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
	}

}

