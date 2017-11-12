package Unidades;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.VisitorEnemigo;

public class Esqueleto extends Enemigo{
	
	public Esqueleto(Mapa m, Celda celda){
		mapa = m;
		celdaActual = celda;
		damage = 2 * damage;
		miVisitor = new VisitorEnemigo(this);
		
		//agrego la gráfica al esqueleto
	}
	

}
