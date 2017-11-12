package Unidades;

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
	
		//Agrego grafica a Barbaro
		miVisitor= new VisitorEnemigo(this);
	}

}