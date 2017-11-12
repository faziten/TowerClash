package Visitor;


import Objeto.*;
import Unidades.*;

public abstract class Visitor {
	
	public abstract void visit(Aliado aliado);
	public abstract void visit(Enemigo enemigo);
	public abstract void visit(ConVida v);
	public abstract void visit(Temporales t);
}
