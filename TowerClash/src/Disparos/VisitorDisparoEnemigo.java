package Disparos;

import Objeto.ConVida;
import Objeto.Temporales;
import Unidades.Aliado;
import Unidades.Enemigo;
import Visitor.Visitor;

public class VisitorDisparoEnemigo extends Visitor{
	
	protected DisparoEnemigo disparo;
	
	public VisitorDisparoEnemigo(DisparoEnemigo de){
		disparo = de;
	}

	public void visit(Aliado aliado) {
		aliado.setVida(aliado.getVida()-disparo.getDamage());
		if(aliado.getVida()<=0)
		{
			aliado.quitar();
		}
	}

	public void visit(Enemigo enemigo) {
		
	}

	public void visit(ConVida v) {
		
	}

	public void visit(Temporales t) {
		
	}

}
