package Objeto;

import Mapa.ElementosMapa;

public abstract class Objeto extends ElementosMapa{
	protected int costo;
	
	public void morir(){
		estaVivo=false;
	}
	
	public int getCosto(){
		return costo;
	}
	

}
