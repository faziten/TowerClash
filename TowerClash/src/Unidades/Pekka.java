package Unidades;

import Main.Visitor;
import Mapa.Celda;

public class Pekka extends Enemigo{
	
	public Pekka(String nombre, Celda celdaActual){}

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

	public void mover() {
		
	}

}
