package Unidades;

import Main.VisitorEnemigo;
import Mapa.Celda;
import Mapa.Mapa;

public class Esqueleto extends Enemigo{
	
	public Esqueleto(Mapa m, Celda celda){
		mapa = m;
		celdaActual = celda;
		damage = 2 * damage;
		miVisitor = new VisitorEnemigo(this);
		
		//agrego la gráfica al esqueleto
	}
	

}
