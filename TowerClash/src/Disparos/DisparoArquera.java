package Disparos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Mapa.Mapa;

public class DisparoArquera extends DisparoAliado{
	public DisparoArquera(int x, int y, float daño, int velocidad) {
		super(x, y, daño, velocidad);
		icono = new ImageIcon(this.getClass().getResource("/images/disparos/DArquera.png"));
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
	}

}
