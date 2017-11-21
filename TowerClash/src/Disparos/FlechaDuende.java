package Disparos;


import Mapa.Celda;
import Mapa.Mapa;

public class FlechaDuende extends DisparoEnemigo{
	public FlechaDuende(Mapa m, Celda celda)
	{
		mapa=m;
		celdaActual=celda;
		damage=5;
		velocidad = 1;
		//imagen.setIcon(new ImageIcon(this.getClass().getResource("")));
	}

}
