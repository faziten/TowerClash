package Unidades;

import javax.swing.ImageIcon;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.VisitorEnemigo;

public class Esqueleto extends Enemigo{
	
	public Esqueleto(Mapa m, Celda celda){
		mapa = m;
		celdaActual = celda;
		damage = 2 * damage;
		miVisitor = new VisitorEnemigo(this);
		imagen.setIcon(new ImageIcon(this.getClass().getResource("/img/enemigos/esqueleto.png")));
	}
	

}
