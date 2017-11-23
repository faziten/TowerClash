package GUI;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;


public class BotonArquera extends BotonAbstracto {

	public BotonArquera(ActionListener al) {
		super(al);
        setIcon(new ImageIcon(this.getClass().getResource("/images/cards/arquera.png")));
	}
	
	public void crearUnidadObjeto(int x, int y) {
		//VER BOTON ARQUERA
		/*Arquera p = new Arquera(y, y, alignmentX, alignmentX, y, y);
		if (p.getPrecio()<=Jugador.getInstance().getDinero()) {
			Jugador.getInstance().crearJugador(p);
		}	*/	
	}
}
