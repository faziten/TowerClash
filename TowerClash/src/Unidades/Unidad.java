package Unidades;

import Main.Visitor;
import Mapa.Celda;

public abstract class Unidad implements Runnable{
	protected int baseHP;
	protected int baseDamage;
	protected int nivel;
	protected int rango;
	protected String nombre;
	protected Celda celdaActual;
	protected int camino;

	
	
	public int getHP(){
		return baseHP;
	}
	
	abstract public void accept(Visitor v);
	abstract public void atacar();
	abstract public void recibirAtaque();
	abstract public void die();
	
}
