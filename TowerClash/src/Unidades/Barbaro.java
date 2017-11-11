package Unidades;

import Main.VisitorEnemigo;
import Mapa.Celda;
import Mapa.Mapa;

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