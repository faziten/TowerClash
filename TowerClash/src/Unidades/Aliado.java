package Unidades;

import Mapa.ElementosComprables;
import Visitor.Visitor;
import Visitor.VisitorAliado;

public abstract class Aliado extends ElementosComprables{
	protected int vida = 100;

	protected int damage = 10;
	protected int rango = 1;
	protected Visitor miVisitor;
	protected int vidaMax=100;
		
	public void accept(Visitor v){
			v.visit(this);
	}
		
	public void setVisitor(VisitorAliado v){
		miVisitor = v;
	}
	
	public int getVidaMax(){
		return vidaMax;
	}

	
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
