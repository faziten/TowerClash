package Unidades;

import Main.VisitorEnemigo;

public abstract class Enemigo extends Unidad{
	protected int puntos;
	protected int velocidad;
	protected int recompensa; //Es la cantidad de monedas que da al morir
	protected VisitorEnemigo visitorEnemigo;
	
	//Retorna la velocidad de cada enemigo.
	public int getVelocidad(){
		return velocidad;
	}
	
	public void setVelocidad(int v){
		velocidad=v;
	}
	
	//Retorna los puntos que otorga cuando muere
	public int getPuntos(){
		return puntos;
	}
	
	public int getRecompensa(){
		return recompensa;
	}
	
	public void atacar(){
		int x= celdaActual.obtenerCoordX();
		int y= celdaActual.obtenerCoordY();
		
	}
	
	public void die(){
		visitorEnemigo.die();
		//this.map.eliminarUnidad(celdaActual);
	}
	
	abstract public void mover();
	
}
