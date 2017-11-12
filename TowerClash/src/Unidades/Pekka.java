package Unidades;


import Mapa.Celda;
import Mapa.Mapa;
import Visitor.VisitorEnemigo;

public class Pekka extends Enemigo{
	
	public Pekka(Mapa m, Celda celda){
		mapa = m;
		celdaActual = celda;
		vida = 5 * vida;
		damage = 8 * damage;
		rango= 4*rango;
		velocidad=5;
		puntaje = 500;
		recompensa = 800;
		miVisitor = new VisitorEnemigo(this);
				
		//agrego la gráfica al Pekka	
	}
}
