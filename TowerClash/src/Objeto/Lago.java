package Objeto;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Disparos.DisparoEnemigo;
import Hilos.HiloLago;
import Mapa.Jugador;
import Mapa.Mapa;
import Unidades.EnemigoCerca;
import Unidades.EnemigoLejos;

public class Lago extends Objeto {

	public Lago(int x, int y) {
		super(x, y, 20);
		icono = new ImageIcon(this.getClass().getResource("/images/lago.png"));		
		lbl = new JLabel(icono);
		lbl.setBounds(x, y, Mapa.EJE, Mapa.EJE);
	}
	
	public boolean visit(EnemigoCerca e) {
		HiloLago hv = new HiloLago();
		hv.start();
		Jugador.getInstance().eliminarObjeto(this);
		return false;
	}
	
	public boolean visit(EnemigoLejos e) {
		if (x-e.getX()<=Mapa.EJE) {
			HiloLago hv = new HiloLago();
			hv.start();
			Jugador.getInstance().eliminarObjeto(this);
		}
		return false;
	}
	
	public boolean visit(DisparoEnemigo e) {
		return false;
	}

}
