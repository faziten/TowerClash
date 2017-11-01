package Unidades;

import Main.Visitor;
import Mapa.Celda;

public class Valquiria extends Aliado{
	
	public Valquiria(String nom, Celda cel){
		this.nombre= nom;
		this.baseDamage=12;
		this.baseHP=70;
		this.baseHPMaxima=70;
		this.rango=1;
		celdaActual= cel;
		precio=100;
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
