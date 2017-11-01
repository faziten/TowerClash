package Unidades;

import Main.Visitor;
import Mapa.Celda;

public class Pekka extends Enemigo{
	
	public Pekka(String nombre, Celda celda){
		this.nombre=nombre;
		this.baseDamage=25;
		this.baseHP=90;
		this.baseHPMaxima=90;
		this.rango=1;
		this.celdaActual=celda;
		celdaActual.setUnidad(this); //VER SI ya esta ocupada.
		this.velocidad=12;
		this.puntos=100;
		this.recompensa=80;
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
