package Unidades;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.VisitorAliado;

public class Mago extends Aliado{
	public Mago(Mapa m, Celda celda){
		mapa = m;
		celdaActual = celda;
		vida = 2 * vida;
		vidaMax=vida;
		damage = 3 * damage;
		precio = 150;
		//agrego la gráfica a Mago
		miVisitor= new VisitorAliado(this);	
	}
}
