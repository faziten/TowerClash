package Unidades;

import Main.Visitor;
import Mapa.Celda;

public class Barbaro extends Enemigo{
	
	public Barbaro(String nombre, Celda celda){
		this.nombre=nombre;
		this.baseDamage=10;
		this.baseHP=50;
		this.baseHPMaxima=50;
		this.rango=0;
		this.celdaActual=celda;
		celdaActual.setUnidad(this); //VER SI ya esta ocupada.
		this.velocidad=12;
		this.puntos=50;
		this.recompensa=30;
	
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
