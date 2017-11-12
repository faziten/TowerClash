package Unidades;


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
		
		
		//agrego la gr�fica al duende
		
		miVisitor = new VisitorEnemigo(this);
	
	}
}