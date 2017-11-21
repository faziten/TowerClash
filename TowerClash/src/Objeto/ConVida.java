package Objeto;

import Visitor.Visitor;

public abstract class ConVida extends Objeto {
	protected int vida=100;
	
	public void setVida(int v){
		vida = v;
	}
	
	public int getVida(){
		return vida;
	}
	
	public void accept(Visitor v){
		v.visit(this);
	}
	
}
