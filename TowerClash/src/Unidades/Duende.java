package Unidades;

import Main.Visitor;
import Mapa.Celda;

public class Duende extends Enemigo {
	
	public Duende(String nombre, Celda celda){
		this.nombre=nombre;
		this.baseDamage=6;
		this.baseHP=40;
		this.baseHPMaxima=40;
		this.rango=1;
		this.puntos=30;
		this.celdaActual=celda;
		this.recompensa=15;
		//VER ESTO
		celdaActual.setUnidad(this);
		
	}
	
	public void moverIzquierda(){
		
		celdaActual.vaciarUnidad(); //libera posicion
		celdaActual.setCode(-1, 0, -1, -1);; //vuelve a dibujar lo que estaba por defecto hay que implementar una lectura de codigo para reescribir el que estaba antes y no el por defecto.	
		celdaActual=celdaActual.obtenerIzquierda(celdaActual);
		celdaActual.setUnidad(this);
		celdaActual.setCode(-1, 4, -1, -1);		
	}
	public synchronized String getNombre(){
		return nombre;
	}
	public int getPuntos(){
		return puntos;
	}
	public synchronized void die(){  //tuve que sincronizarlo para que no me queden cadaveres en el mapa jaja. 
		//Falta hacer que muera a nivel logico
		celdaActual.matarDuende(this);
		celdaActual.setCode(-1, 11, -1, -1);
		celdaActual.setUnidad(null);
		celdaActual=null;
		System.out.println(nombre+": Ouch!");
	}
	
	public void run() {
		moverIzquierda();
		
	}


	public void accept(Visitor v) {
		System.out.println("Me visitaron!");
		v.visit(this);
	}

	public void atacar() {
		
	}

	public void recibirAtaque() {
		
	}

	public void mover() {
		
	}
	
	
	
}
