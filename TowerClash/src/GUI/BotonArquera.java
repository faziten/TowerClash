package GUI;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import Mapa.Jugador;
import Unidades.Arquera;


public class BotonArquera extends BotonAbstracto {

	public BotonArquera(ActionListener al) {
		super(al);
        setIcon(new ImageIcon(this.getClass().getResource("/images/cards/arquera.png")));
	}
	
	public void crearUnidadObjeto(int x, int y) {
		Arquera p = new Arquera(x,y);
		if (p.getPrecio()<=Jugador.getInstance().getDinero()) {
			Jugador.getInstance().crearJugador(p);
		}		
	}
}
