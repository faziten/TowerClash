package Visitor;

import Objeto.ConVida;
import Objeto.Temporales;
import PowerUp.Curacion;
import Unidades.Aliado;
import Unidades.Enemigo;

public class VisitorCuracion extends Visitor {
	private Curacion cura;
	
	public VisitorCuracion(Curacion c){
		cura=c;
	}

	public void visit(Aliado aliado) {
		int suma;
		suma= aliado.getVida()+cura.getVidaExtra();
		if (suma>aliado.getVidaMax()) //Si se sobrepaso de la vida maxima
			aliado.setVida(aliado.getVidaMax());
		else
			aliado.setVida(suma);
	}

	public void visit(Enemigo enemigo) {
		
	}

	public void visit(ConVida v) {
		
	}

	public void visit(Temporales t) {
		
	}

}
