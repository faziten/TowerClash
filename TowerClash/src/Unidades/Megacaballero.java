package Unidades;

import javax.swing.ImageIcon;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.VisitorAliado;

public class Megacaballero extends Aliado{
	public Megacaballero(Mapa m, Celda celda){
		mapa = m;
		celdaActual = celda;
		
		vida = 4 * vida;
		vidaMax=vida;
		damage = 7 * damage;
		precio = 70;
		rango=4*rango;
		imagen.setIcon(new ImageIcon(this.getClass().getResource("/img/unidades/megacaballero.png")));
					
		miVisitor = new VisitorAliado(this);
				
	}

}
