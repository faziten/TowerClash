package Unidades;


import Main.VisitorEnemigo;
import Mapa.Celda;
import Mapa.Mapa;

public class Duende extends Enemigo {
	
	public Duende(Mapa m, Celda celda){
		
		mapa = m;
		celdaActual = celda;
		vida = 2 * vida;
		damage = 2 * damage;
		puntaje = 150;
		recompensa = 100;
		
		
		//agrego la gráfica al duende
		
		miVisitor = new VisitorEnemigo(this);
	
	}
}