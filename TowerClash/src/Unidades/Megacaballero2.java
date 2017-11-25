package Unidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Mapa.Mapa;

public class Megacaballero2 extends Megacaballero {

	public Megacaballero2(int x, int y) {
		super(x, y, 50, 10, 8, 0);
		icono = new ImageIcon(this.getClass().getResource("/images/unidades/megacaballero2.png"));
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
		agregarPW();
	}	

}
