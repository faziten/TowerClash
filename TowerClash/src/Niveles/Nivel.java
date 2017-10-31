package Niveles;

import Mapa.Mapa;

public abstract class Nivel {
	protected Mapa map;
	protected int masOro;
	protected Horda[] hordas;
	protected Nivel siguiente;
	
	public abstract void crearHordas();
	
	

}
