package GUI;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import Mapa.Jugador;


public class BotonGolem extends BotonAbstracto {

	public BotonGolem(ActionListener al) {
		super(al);
        setIcon(new ImageIcon(this.getClass().getResource("/images/objetos/golem.png")));
	}	
	
	public void crearUnidadObjeto(int x, int y) {
		/*Golem b = new Golem(x, y);
		if (b.getValor()<=Jugador.getInstance().getDinero()) {
			Jugador.getInstance().crearObjeto(b);
		}	*/
	}	
}
