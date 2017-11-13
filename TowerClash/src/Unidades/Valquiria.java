package Unidades;

import javax.swing.ImageIcon;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.VisitorAliado;

public class Valquiria extends Aliado{
	
	public Valquiria(Mapa m, Celda celda){
		mapa = m;
		celdaActual = celda;
		damage = 3 * damage;
		precio=40;
		vidaMax=vida;
		imagen = new ImageIcon(this.getClass().getResource("/img/unidades/valquiria.png"));
		miVisitor = new VisitorAliado(this);
		
	}

	
}
