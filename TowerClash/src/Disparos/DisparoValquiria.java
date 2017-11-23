package Disparos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Mapa.Mapa;

public class DisparoValquiria extends DisparoAliado {

	public DisparoValquiria(int x, int y, float daño, int velocidad) {
		super(x, y, daño, velocidad);
		icono = new ImageIcon(this.getClass().getResource("/images/disparos/DValquiria.png"));
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
	}
	
}

