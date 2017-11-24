package Objeto;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparos.DisparoEnemigo;
import Mapa.Mapa;
import Unidades.EnemigoCerca;
import Unidades.EnemigoLejos;


public class Golem extends Objeto {

	private float vida;

	public Golem(int x, int y) {
		super(x, y, 15);
		vida = 50;
		icono = new ImageIcon(this.getClass().getResource("/images/unidades/golem.png"));		
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
	}

	public boolean visit(EnemigoCerca e) {
		vida -= e.getDaño()/8;
		if (vida<=0) {
			die();
		}
		return true;
	}
	
	public boolean visit(EnemigoLejos e) {
		return true;
	}
	
	public boolean visit(DisparoEnemigo e) {
		vida -= e.getDaño();
		if (vida<=0) {
			die();
		}
		return true;
	}
	
}

