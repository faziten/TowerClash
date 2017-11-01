package Unidades;

import Main.Visitor;
import Mapa.Celda;

public class Chispitas extends Enemigo{
	
	public Chispitas(String nombre, Celda celda){
		this.nombre=nombre;
		this.baseDamage=15;
		this.baseHP=80;
		this.baseHPMaxima=80;
		this.rango=2;
		this.celdaActual=celda;
		this.velocidad=8;
		this.puntos=120;
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
