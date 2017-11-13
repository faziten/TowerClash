package Unidades;

import javax.swing.ImageIcon;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.VisitorAliado;

public class Mago extends Aliado{
	public Mago(Mapa m, Celda celda){
		mapa = m;
		celdaActual = celda;
		vida = 2 * vida;
		vidaMax=vida;
		damage = 3 * damage;
		precio = 50;
		imagen = new ImageIcon(this.getClass().getResource("/img/unidades/mago.png"));
		miVisitor= new VisitorAliado(this);	
	}
}
