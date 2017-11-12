package PowerUp;

import Mapa.Celda;
import Mapa.Mapa;

public class Moneda extends PowerUp{
	protected int masOro;
	
	public Moneda(Mapa m, Celda c){
		mapa=m;
		celdaActual=c;
		
	}
	
	public void accion(){
		mapa.getJugador().agregarOro(masOro);
		
		
	}

}
