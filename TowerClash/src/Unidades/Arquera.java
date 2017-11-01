package Unidades;

import Main.Visitor;
import Mapa.Celda;

public class Arquera extends Aliado{
	
	public Arquera(String nombre, Celda celda){
		this.nombre= nombre;
		this.baseDamage=7;
		this.baseHP=40;
		this.baseHPMaxima=40;
		this.rango=2;
		celdaActual= celda;
		precio=100;
		
	}

	public void run() {
	}

	public void accept(Visitor v){
		v.visit(this);
	}

	public void atacar() {
		
	}

	public void die() {
		
	}

}
