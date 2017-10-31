package Unidades;

import Main.Visitor;
import Mapa.Celda;

public class Mago extends Aliado{
	public Mago(String nombre, Celda celda){}

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
