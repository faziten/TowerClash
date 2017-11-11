package Unidades;

import Main.Visitor;
import Mapa.*;

public abstract class Unidad extends ElementosMapa {

	protected int damage = 10;
	protected int rango = 1;
	protected boolean estaVivo = true;
	protected int x;
	protected int y;
		
		
	public abstract void accept(Visitor v);
		
	public int getVida(){
		return vida;
	}

	public int getAlcance(){
		return rango;
	}
		
	public int getDamage(){
		return damage;
	}
		
	public boolean estaVivo(){
		return estaVivo;
	}
		
	public void setVida(int v){
		vida = v;
	}

	public void morir(boolean b) {
		estaVivo = b;
	}
	
}