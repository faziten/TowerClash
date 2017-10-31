package Unidades;

import Main.Visitor;
import Mapa.Celda;

public class Chispitas extends Enemigo{
	
	public Chispitas(String nombre, Celda celda){
		this.nombre=nombre;
		this.baseDamage=5;
		this.baseHP=50;
		this.nivel=0;
		this.rango=0;
		this.celdaActual=celda;
		celdaActual.setUnidad(this); //VER SI ya esta ocupada.
		velocidad=0;
		puntos=25;
		velocidad=0;
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

	public void mover() {
		
	}

}
