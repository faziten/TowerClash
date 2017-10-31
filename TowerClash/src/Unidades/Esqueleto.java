package Unidades;

import Main.Visitor;
import Mapa.Celda;

public class Esqueleto extends Enemigo{
	
	public Esqueleto(String nombre, Celda celActual){}

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
