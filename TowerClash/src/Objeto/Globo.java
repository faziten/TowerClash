package Objeto;

import Main.Visitor;
import Mapa.Celda;
import Mapa.Mapa;

public class Globo extends ConVida {
	public Globo(Mapa m, Celda celda){
		mapa=m;
		celdaActual=celda;
		vida+=100;
	}

	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
