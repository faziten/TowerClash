package Unidades;

import Mapa.*;
import Visitor.Visitor;

public abstract class Unidad extends ElementosMapa {
	protected int vida = 100;

	protected int damage = 10;
	protected int rango = 1;
	protected Visitor miVisitor;
		
		
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
	
	public Visitor getVisitor(){
		return miVisitor;
	}

	
}