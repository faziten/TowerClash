package Visitor;

import Objeto.ConVida;
import Objeto.Temporales;
import PowerUp.Bomba;
import Unidades.Aliado;
import Unidades.Enemigo;

public class VisitorBomba extends Visitor{
	protected Bomba bomba;

	public VisitorBomba(Bomba b){
		bomba=b;
	}

	public void visit(Aliado aliado) {
	
	}

	public void visit(Enemigo enemigo) {
		enemigo.setVida(enemigo.getVida() - bomba.getDamage());
		if (enemigo.getVida() <= 0) {
			enemigo.morir(false);
			enemigo.actualizarOroPuntaje();
			enemigo.getCelda().setElemento(null);
		}
		
	}

	public void visit(ConVida v) {
		
	}

	public void visit(Temporales t) {
		
	}
}
