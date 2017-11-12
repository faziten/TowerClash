package Objeto;

import Main.Visitor;
import Mapa.Celda;
import Mapa.Mapa;

public class Golem extends ConVida{
	public Golem(Mapa m, Celda celda){
		mapa=m;
		celdaActual=celda;
		vida+=50;
	}

	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
