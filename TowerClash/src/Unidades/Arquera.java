package Unidades;


import Main.VisitorAliado;
import Mapa.Celda;
import Mapa.Mapa;


public class Arquera extends Aliado{

	public Arquera(Celda c, Mapa m)
	{
		mapa=m;
		celdaActual = c;
		vida = 2 * vida;
		damage = 2 * damage;
		precio = 50;
		rango = 2 * rango;
		miVisitor= new VisitorAliado(this);
		
		//agrego la gráfica a Arquera

	}
	
}
