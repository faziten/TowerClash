package GUI;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public abstract class BotonAbstracto extends JButton {

	public BotonAbstracto(ActionListener al) {
		super();
		setBorder(null);
	    setContentAreaFilled(false);
	    addActionListener(al);
	}

	public abstract void crearUnidadObjeto(int x, int y);
}

