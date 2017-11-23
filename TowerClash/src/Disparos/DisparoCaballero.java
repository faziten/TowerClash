package Disparos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Mapa.Mapa;

public class DisparoCaballero extends DisparoAliado{

	public DisparoCaballero(int x, int y, float da�o, int velocidad) {
		super(x, y, da�o, velocidad);
		icono = new ImageIcon(this.getClass().getResource("/images/disparos/DCaballero.png"));
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
	}
}
