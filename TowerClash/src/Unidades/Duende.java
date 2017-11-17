package Unidades;


import javax.swing.ImageIcon;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.VisitorEnemigo;

public class Duende extends Enemigo {
	
	public Duende(Mapa m, Celda celda){
		
		mapa = m;
		celdaActual = celda;
		vida = 2 * vida;
		damage = 2 * damage;
		puntaje = 150;
		recompensa = 100;
		imagen.setIcon(new ImageIcon(this.getClass().getResource("/img/enemigos/duende.png")));
		miVisitor = new VisitorEnemigo(this);
	
	}
}