package Unidades;

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

	
	protected abstract void setArma();
	public abstract void accept(Visitor visitor); //visit(this).
	public abstract void subirNivel();
	public abstract int obtenerNivel();
	
}
