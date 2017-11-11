package Main;

import Objeto.*;
import PowerUp.*;
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
			a.getCelda().setUnidad(null);
			//e.setMovimiento(true);
				
			//e.setImagenEnMovimiento(); //ultimo cambio
		}
	}
	
	public void visit(Enemigo e)
	{
		
	}

	public void visit(PowerUp pw) {
		
	}

	public void visit(Objeto j) {
		
	}
	
}
