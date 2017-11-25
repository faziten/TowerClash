package GUI;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import Mapa.Jugador;
import Unidades.Caballero;


public class BotonCaballero extends BotonAbstracto {
	
	public BotonCaballero(ActionListener al) {
		super(al);
        setIcon(new ImageIcon(this.getClass().getResource("/images/cards/caballero.png")));
	}
	
	public void crearUnidadObjeto(int x, int y) {
		Caballero b = new Caballero(x, y);
		if (b.getPrecio()<=Jugador.getInstance().getDinero()) {
			Jugador.getInstance().crearJugador(b);
		}
				
	}
}
