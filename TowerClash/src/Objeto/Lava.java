package Objeto;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparos.DisparoEnemigo;
import Mapa.Mapa;
import Unidades.EnemigoCerca;
import Unidades.EnemigoLejos;

public class Lava extends Objeto {
	
	private float daño;

	public Lava(int x, int y) {
		super(x, y, 20);
		daño = 10;
		icono = new ImageIcon(this.getClass().getResource("/images/lava.png"));		
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
	}
	
	public boolean visit(DisparoEnemigo d) {
		return true;
	}

	public boolean visit(EnemigoCerca e) {
		e.recibirDaño(daño/8);
		return false;
	}

	public boolean visit(EnemigoLejos e) {
		if (x-e.getX()<=Mapa.EJE) {
			e.recibirDaño(daño/8);
		}
		return false;
	}

}
