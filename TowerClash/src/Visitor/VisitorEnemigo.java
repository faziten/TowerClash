package Visitor;

import Objeto.*;
import Unidades.*;

public class VisitorEnemigo extends Visitor{
	private Enemigo miEnemigo;
	
	public VisitorEnemigo(Enemigo e){
		miEnemigo = e;
	}
	
	public void visit(Aliado a){
		a.setVida(a.getVida()-miEnemigo.getDamage());
		if (a.getVida() <= 0) {
			a.morir(false);
			a.getCelda().setElemento(null);

		}
	}
	
	public void visit(Enemigo e)
	{
		
	}


	public void visit(ConVida v) {
		v.setVida(v.getVida() - miEnemigo.getDamage());
		if (v.getVida() <= 0) {
			v.getCelda().setElemento(null);
			v.morir();
		
		}
	}

	public void visit(Temporales t) {
		
	}
	
}
