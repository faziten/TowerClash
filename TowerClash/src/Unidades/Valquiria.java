package Unidades;

import Main.Visitor;
import Mapa.Celda;

public class Valquiria extends Aliado{
	
	public Valquiria(String nom, Celda cel){}

	public void run() {
		
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

	public void atacar() {
	}

	public void recibirAtaque() {
		
	}

	public void die() {
		
	}

}
