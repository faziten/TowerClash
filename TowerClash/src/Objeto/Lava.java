package Objeto;

import javax.swing.ImageIcon;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.Visitor;

public class Lava extends Temporales{
	
	public Lava(Mapa m, Celda celda){
		mapa= m;
		celdaActual=celda;
		tiempo=3*tiempo;
		precio=30;
		imagen.setIcon(new ImageIcon(this.getClass().getResource("/img/lava.png")));
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

}
