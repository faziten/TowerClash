package Unidades;

import Main.VisitorAliado;
import Mapa.Celda;
import Mapa.Mapa;

public class Mago extends Aliado{
	public Mago(Mapa m, Celda celda){
		mapa = m;
		celdaActual = celda;
		vida = 2 * vida;
		damage = 3 * damage;
		precio = 150;
		//agrego la gráfica a Mago
		miVisitor= new VisitorAliado(this);	
	}
}
