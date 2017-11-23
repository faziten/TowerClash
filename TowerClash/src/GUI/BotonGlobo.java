package GUI;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;


public class BotonGlobo extends BotonAbstracto {

	public BotonGlobo(ActionListener al) {
		super(al);
        setIcon(new ImageIcon(this.getClass().getResource("/images/objetos/globo.png")));   
	}	
	
	public void crearUnidadObjeto(int x, int y) {
		/*Globo t = new Globo(x, y);
		if (t.getValor()<=Jugador.getInstance().getDinero()) {
			Jugador.getInstance().crearObjeto(new Globo(x, y));	
		}	*/		
	}
}