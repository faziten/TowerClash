package PowerUp;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.VisitorCuracion;

public class Curacion extends PowerUp{
	
	private int vidaExtra;
	
	public Curacion(Mapa m, Celda celda){
		mapa=m;
		celdaActual=celda;
		vidaExtra=20;
		miVisitor= new VisitorCuracion(this);
		
	}
	
	public int getVidaExtra(){
		return vidaExtra;
	}

}
