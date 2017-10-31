package Unidades;

import Main.Visitor;
import Mapa.Celda;

public class Gigante extends Enemigo{
	
	public Gigante (String nombre, Celda cel){}

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
