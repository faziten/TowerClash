package Unidades;

import Main.Visitor;
import Mapa.Celda;

public class Megacaballero extends Aliado{
	public Megacaballero(String nombre, Celda cel){
		this.nombre= nombre;
		this.baseDamage=30;
		this.baseHP=100;
		this.baseHPMaxima=100;
		this.rango=2;
		this.celdaActual= cel;
		precio=160;
		
	}

	public void run() {
		
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

	public void atacar() {
		
	}


	public void die() {
		
	}

}
