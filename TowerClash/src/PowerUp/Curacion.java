package PowerUp;

import Mapa.Celda;
import Mapa.Mapa;

public class Curacion extends PowerUp{
	
	public Curacion(int x, int y) {
		super(x, y);
	}


	private int vidaExtra;
	
	
	public int getVidaExtra(){
		return vidaExtra;
	}

}
