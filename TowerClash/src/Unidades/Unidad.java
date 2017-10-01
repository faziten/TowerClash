package Unidades;

import java.security.DigestException;

import Arma.Arma;
import Main.Visitor;
import Mapa.Celda;

public abstract class Unidad extends Thread implements Visitor {
	protected int baseHP;
	protected int baseDamage;
	protected int nivel;
	protected int rango;
	protected String nombre;
	protected Arma arma;
	protected Celda celdaActual;
	protected int camino;
	protected  int puntos;
	
	protected abstract void setArma();
	public abstract void accept(Visitor visitor); //visit(this).
	public abstract void subirNivel();
	public abstract int obtenerNivel();
	//public abstract Celda obtenerCeldaActual();
	
	//SETTERS TRIVIALES
	public synchronized void setCamino(int camino){
		this.camino=camino;
	}
	
	//GETTERS TRIVIALES
	public int getPuntos(){
		return puntos;
	}
	public synchronized String getNombre(){
		return nombre;
	}
	
}
