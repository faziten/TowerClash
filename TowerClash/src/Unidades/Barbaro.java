package Unidades;

import javax.swing.ImageIcon;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.VisitorEnemigo;

public class Barbaro extends Enemigo{
	
	public Barbaro(Mapa m, Celda celda){
		mapa = m;
		celdaActual = celda;
		vida = 2 * vida;
		damage = 3 * damage;
		puntaje = 150;
		recompensa = 225;
		velocidad=3;
	
		imagen.setIcon(new ImageIcon(this.getClass().getResource("/img/enemigos/barbaro.png")));
		miVisitor= new VisitorEnemigo(this);
	}

}