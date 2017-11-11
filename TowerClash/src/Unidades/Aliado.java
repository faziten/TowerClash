package Unidades;

import Main.Visitor;
import Main.VisitorAliado;

public abstract class Aliado extends Unidad{
	protected int precio = 125;
		
	public void accept(Visitor v){
			v.visit(this);
	}
		
	public int getPrecio(){
		return precio;
	}
		
	public void setVisitor(VisitorAliado v){
		miVisitor = v;
	}
			
}
