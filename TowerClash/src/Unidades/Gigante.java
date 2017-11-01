package Unidades;

import Main.Visitor;
import Mapa.Celda;

public class Gigante extends Enemigo{
	
	public Gigante (String nombre, Celda celda){
		this.nombre=nombre;
		this.baseDamage=20;
		this.baseHP=80;
		this.baseHPMaxima=80;
		this.rango=1;
		this.celdaActual=celda;
		celdaActual.setUnidad(this); //VER SI ya esta ocupada.
		this.velocidad=10;
		this.puntos=80;
		this.recompensa=60;
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
