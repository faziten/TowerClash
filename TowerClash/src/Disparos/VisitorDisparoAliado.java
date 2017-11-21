package Disparos;

import Objeto.ConVida;
import Objeto.Temporales;
import Unidades.Aliado;
import Unidades.Enemigo;
import Visitor.Visitor;

public class VisitorDisparoAliado extends Visitor{
	protected DisparoAliado disparo;
	
	public VisitorDisparoAliado(DisparoAliado dp){
		disparo = dp;
	}

	public void visit(Aliado aliado) {
		
	}

	public void visit(Enemigo enemigo) {
		enemigo.setVida(enemigo.getVida()-disparo.getDamage());
		if(enemigo.getVida()<=0)
			enemigo.quitar();
		
	}

	public void visit(ConVida v) {
		
	}

	public void visit(Temporales t) {
		
	}
}
