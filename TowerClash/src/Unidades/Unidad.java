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
	protected  int puntos;
	
	abstract public void accept(Visitor v);
}
