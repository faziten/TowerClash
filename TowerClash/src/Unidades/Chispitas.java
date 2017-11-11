package Unidades;


import Main.VisitorEnemigo;
import Mapa.Celda;
import Mapa.Mapa;

public class Chispitas extends Enemigo{
	
	public Chispitas(Mapa m, Celda celda){
		mapa = m;
		celdaActual = celda;
		vida = 4 * vida;
		damage = 5 * damage;
		puntaje = 500;
		recompensa = 300;
		velocidad=3;
		rango=2*rango;
		
		
		miVisitor = new VisitorEnemigo(this);
		
		//agrego grafica a Chispitas
	}


}
