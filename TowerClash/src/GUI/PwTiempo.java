package GUI;

import javax.swing.Icon;
import javax.swing.JLabel;

import PowerUp.Tiempo;


public class PwTiempo extends JLabel {
		
	protected Tiempo pw;

	public PwTiempo(Tiempo pu, Icon i) {
			super(i);
			pw = pu;
		}
		
		public Tiempo getPW() {
			return pw;
		}

}


