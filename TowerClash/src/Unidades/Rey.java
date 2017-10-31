package Unidades;

import Main.Visitor;

public class Rey extends Estructura{

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
