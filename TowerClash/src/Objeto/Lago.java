package Objeto;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.Visitor;

public class Lago extends Temporales{
	
	public Lago(Mapa m, Celda celda){
		mapa= m;
		celdaActual=celda;
		tiempo=2*tiempo;
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

}
