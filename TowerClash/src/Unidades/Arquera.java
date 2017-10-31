package Unidades;

import Main.Visitor;
import Mapa.Celda;

public class Arquera extends Aliado{
	
	public Arquera(String nombre, Celda celda){
		this.nombre= nombre;
		this.baseDamage=6;
		this.baseHP=60;
		this.nivel=0;
		this.rango=0;
		this.celdaActual=celda;
		celdaActual.setUnidad(this);
		
	}

	public void run() {
	}

	public void accept(Visitor v){
		v.visit(this);
	}

	public void atacar() {
		
	}

	public void recibirAtaque() {
		
	}

	public void die() {
		
	}

}
