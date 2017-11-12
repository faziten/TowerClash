package PowerUp;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.Visitor;

public abstract class PowerUp {
	protected Mapa mapa;
	protected Celda celdaActual;
	protected Visitor miVisitor;
	
	public Visitor getVisitor(){
		return miVisitor;
	}

}
