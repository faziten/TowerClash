package Unidades;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.VisitorAliado;

public class Valquiria extends Aliado{
	
	public Valquiria(Mapa m, Celda celda){
		mapa = m;
		celdaActual = celda;
		damage = 3 * damage;
		precio=100;
		vidaMax=vida;
		//agrego la gráfica a Valquiria	
		miVisitor = new VisitorAliado(this);
		
	}

	
}
