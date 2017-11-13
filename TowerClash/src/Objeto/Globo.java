package Objeto;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.Visitor;

public class Globo extends ConVida {
	public Globo(Mapa m, Celda celda){
		mapa=m;
		celdaActual=celda;
		vida+=50;
		precio= 30;
	}

	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
