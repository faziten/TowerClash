package Objeto;

import Mapa.ElementosComprables;

public abstract class Objeto extends ElementosComprables{
	protected int costo;
	
	public void morir(){
		estaVivo=false;
	}
	
	public int getCosto(){
		return costo;
	}
	

}
