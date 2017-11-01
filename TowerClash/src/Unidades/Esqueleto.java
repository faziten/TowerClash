package Unidades;

import Main.Visitor;
import Mapa.Celda;

public class Esqueleto extends Enemigo{
	
	public Esqueleto(String nombre, Celda celda){
		this.nombre=nombre;
		this.baseDamage=5;
		this.baseHP=40;
		this.baseHPMaxima=40;
		this.rango=1;
		this.celdaActual=celda;
		celdaActual.setUnidad(this); //VER SI ya esta ocupada.
		this.velocidad=12;
		this.puntos=10;
		this.recompensa=10;
		
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
