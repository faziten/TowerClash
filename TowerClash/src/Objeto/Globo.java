package Objeto;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparos.DisparoEnemigo;
import Mapa.Jugador;
import Mapa.Mapa;
import Unidades.EnemigoCerca;
import Unidades.EnemigoLejos;

public class Globo extends Objeto {

	public Globo(int x, int y) {
		super(x, y, 60);
		icono = new ImageIcon(this.getClass().getResource("/images/unidades/globo.png"));		
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
	}

	public boolean visit(EnemigoCerca e) {
		e.die();
		Jugador.getInstance().eliminarObjeto(this);
		return false;
	}
	
	public boolean visit(EnemigoLejos e) {
		if (Jugador.getInstance().getElemento(x/Mapa.EJE-1, y/Mapa.EJE)==e) {
			e.die();
			Jugador.getInstance().eliminarObjeto(this);
			return true;
		}
		else {
			return false;
		}		
	}
	
	public boolean visit(DisparoEnemigo e) {
		return false;
	}

}

