package Unidades;

import Main.Visitor;
import Mapa.Celda;

public class Mago extends Aliado{
	public Mago(String nombre, Celda celda){
		this.nombre= nombre;
		this.baseDamage=12;
		this.baseHP=60;
		this.baseHPMaxima=60;
		this.rango=1;
		celdaActual= celda;
		precio=80;
	}

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
