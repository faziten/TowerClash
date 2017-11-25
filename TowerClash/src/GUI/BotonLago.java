package GUI;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import Mapa.Jugador;
import Objeto.Lago;

public class BotonLago extends BotonAbstracto {

	public BotonLago(ActionListener al) {
		super(al);
        setIcon(new ImageIcon(this.getClass().getResource("/images/objetos/lago.png")));
    }	
	
	public void crearUnidadObjeto(int x, int y) {
		Lago v = new Lago(x, y);
		if (v.getValor()<=Jugador.getInstance().getDinero()) {
			Jugador.getInstance().crearObjeto(v);			
		}		
	}	
}
