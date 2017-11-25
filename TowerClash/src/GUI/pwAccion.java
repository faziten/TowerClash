package GUI;

import javax.swing.Icon;
import javax.swing.JLabel;

import PowerUp.Accion;


public class pwAccion extends JLabel {
	
	private Accion pw;

	public pwAccion(Accion pu, Icon i) {
		super(i);
		pw = pu;
	}

	public Accion getPW() {
		return pw;
	}

}
