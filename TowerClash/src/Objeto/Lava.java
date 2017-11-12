package Objeto;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.Visitor;

public class Lava extends Temporales{
	
	public Lava(Mapa m, Celda celda){
		mapa= m;
		celdaActual=celda;
		tiempo=3*tiempo;
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

}
