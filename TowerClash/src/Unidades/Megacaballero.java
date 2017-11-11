package Unidades;

import Main.VisitorAliado;
import Mapa.Celda;
import Mapa.Mapa;

public class Megacaballero extends Aliado{
	public Megacaballero(Mapa m, Celda celda){
		mapa = m;
		celdaActual = celda;
		
		vida = 4 * vida;
		damage = 7 * damage;
		precio = 300;
		rango=4*rango;
		//agrego la gráfica a Dragon
					
		miVisitor = new VisitorAliado(this);
				
	}

}
