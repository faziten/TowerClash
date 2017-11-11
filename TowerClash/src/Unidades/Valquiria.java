package Unidades;

import Main.VisitorAliado;
import Mapa.Celda;
import Mapa.Mapa;

public class Valquiria extends Aliado{
	
	public Valquiria(Mapa m, Celda celda){
		mapa = m;
		celdaActual = celda;
		damage = 3 * damage;
		precio=100;
		//agrego la gráfica a Valquiria	
		miVisitor = new VisitorAliado(this);
		
	}

	
}
