package Unidades;


import javax.swing.ImageIcon;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.VisitorAliado;


public class Arquera extends Aliado{

	public Arquera(Mapa m, Celda c)
	{
		mapa=m;
		celdaActual = c;
		vida = 2 * vida;
		vidaMax=vida;
		damage = 2 * damage;
		precio = 30;
		rango = 2 * rango;
		miVisitor= new VisitorAliado(this);
		imagen.setIcon( new ImageIcon(this.getClass().getResource("/img/unidades/arquera.png")));

	}
	
}
