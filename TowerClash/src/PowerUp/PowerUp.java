package PowerUp;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.Visitor;

public abstract class PowerUp{
	protected Visitor miVisitor;
	protected Mapa mapa;
	protected Celda celdaActual;
	public Visitor getVisitor(){
		return miVisitor;
	}

}
