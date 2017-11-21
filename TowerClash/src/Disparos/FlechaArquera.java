package Disparos;

import Mapa.Celda;
import Mapa.Mapa;

public class FlechaArquera extends DisparoAliado{
	public FlechaArquera(Mapa m, Celda celda){
		mapa=m;
		celdaActual=celda;
		damage=5;
		velocidad = 2;
		//imagen.setIcon(new ImageIcon(this.getClass().getResource()));

	}

}
