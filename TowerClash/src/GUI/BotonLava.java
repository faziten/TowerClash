package GUI;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import Hilos.HiloTiempo;
import Mapa.Jugador;
import Objeto.Lava;


public class BotonLava extends BotonAbstracto {

	public BotonLava(ActionListener al) {
		super(al);
		setIcon(new ImageIcon(this.getClass().getResource("/images/objetos/volcan.png")));
	}

	public void crearUnidadObjeto(int x, int y) {
		Lava f = new Lava(x, y);
		if (f.getValor()<=Jugador.getInstance().getDinero()) {
			Jugador.getInstance().crearObjeto(f);
			HiloTiempo ht = new HiloTiempo(f, 5);
			ht.start();
		}
	}
}