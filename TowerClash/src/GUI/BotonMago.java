package GUI;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;


public class BotonMago extends BotonAbstracto { 

	public BotonMago(ActionListener al) {
		super(al);
        setIcon(new ImageIcon(this.getClass().getResource("/images/cards/mago.png")));
	}
	
	public void crearUnidadObjeto(int x, int y) {
		/*Mago r = new Mago(x, y);
		if (r.getPrecio()<=Jugador.getInstance().getDinero()) {
			Jugador.getInstance().crearJugador(r);
		}*/
		
	}
}
