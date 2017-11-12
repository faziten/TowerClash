package Unidades;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.VisitorEnemigo;

public class Gigante extends Enemigo{
	
	public Gigante(Mapa m, Celda celda){
		mapa = m;
		celdaActual = celda;
		vida = 3 * vida;
		damage = 5 * damage;
		puntaje = 250;
		recompensa = 200;
		miVisitor = new VisitorEnemigo(this);
		
		//agrego la gráfica al Gigante
	}
	
}
