package GUI;

import javax.swing.Icon;
import javax.swing.JLabel;

public class Grafico {
	protected int x;
	protected int y;
	protected JLabel lbl;	
	protected Icon icono;

	public Grafico(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public JLabel getLbl() {
		return lbl;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
