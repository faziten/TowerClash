package GUI;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import Unidades.Megacaballero;

public class BotonMegacaballero extends BotonAbstracto {

		public BotonMegacaballero(ActionListener al) {
			super(al);
			setIcon(new ImageIcon(this.getClass().getResource("/images/cards/megacaballero.png")));
		}

		public void crearUnidadObjeto(int x, int y) {
			Megacaballero d1;
			Megacaballero d2;
			/*if (Jugador.getInstance().getElemento(x/64, y/64+1)==null) {
				d1 = new Megacaballero1(x, y);
				d2 = new Megacaballero2(x, y+Mapa.EJE);
				d1.setMitad(d2);
				d2.setMitad(d1);
				if (d1.getPrecio()<=Jugador.getInstance().getDinero()) {
					Jugador.getInstance().crearJugador(d1);
					Jugador.getInstance().crearJugador(d2);
				}
			}*/

		}
}
