package Unidades;


import Main.*;
import Mapa.Celda;
//import PowerUps.DefaultAliado;
import Mapa.Mapa;

public class Caballero extends Aliado{
	
	
	public Caballero(Mapa m, Celda celda){
		mapa=m;
		celdaActual=celda;
		vida=2*vida;
		damage = 2 * damage;
		precio = 150;
		
		//agrego la gráfica a Caballero
		
		miVisitor = new VisitorAliado(this);
		
	}
	
}
