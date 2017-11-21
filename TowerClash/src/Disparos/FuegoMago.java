package Disparos;

import Mapa.Celda;
import Mapa.Mapa;

public class FuegoMago extends DisparoAliado{
	
	public FuegoMago(Mapa m, Celda celda){
		celdaActual=celda;
		damage=8;
		velocidad = 1;
		//imagen.setIcon(new ImageIcon(this.getClass().getResource("")));

	}
}
