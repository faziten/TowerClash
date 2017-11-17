package Unidades;


import javax.swing.ImageIcon;

import Mapa.Celda;
//import PowerUps.DefaultAliado;
import Mapa.Mapa;
import Visitor.*;

public class Caballero extends Aliado{
	
	
	public Caballero(Mapa m, Celda celda){
		mapa=m;
		celdaActual=celda;
		vida=2*vida;
		vidaMax=vida;
		damage = 2 * damage;
		precio = 30;
		imagen.setIcon(new ImageIcon(this.getClass().getResource("/img/unidades/caballero.png")));
		
		miVisitor = new VisitorAliado(this);
		
	}
	
}
