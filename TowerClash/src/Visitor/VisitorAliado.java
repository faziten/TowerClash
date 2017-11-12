package Visitor;

import Objeto.ConVida;
import Objeto.Temporales;
import Unidades.*;

public class VisitorAliado extends Visitor{
	private Aliado miAliado;
	
	public VisitorAliado(Aliado a){
		miAliado=a;
	}
	
	public void visit(Aliado a){
	}
		
	public void visit(Enemigo e){
		e.setVida(e.getVida() - miAliado.getDamage());
		if (e.getVida() <= 0) {
			e.morir(false);
			e.actualizarOroPuntaje();
			e.getCelda().setElemento(null);
			}
		}

	public void visit(ConVida v) {
		
	}

	public void visit(Temporales t) {
		
	}

}
