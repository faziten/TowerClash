package GUI;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;


public class BotonValquiria extends BotonAbstracto {

	public BotonValquiria(ActionListener al) {
		super(al);
        setIcon(new ImageIcon(this.getClass().getResource("/images/cards/valquiria.png")));
	}

	public void crearUnidadObjeto(int x, int y) {
		/*Valquiria v = new Valquiria(x, y);
		if (v.getPrecio()<=Jugador.getInstance().getDinero()) {
			Jugador.getInstance().crearJugador(new Valquiria(x, y));
		}	*/	
	}
}


