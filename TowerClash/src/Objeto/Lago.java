package Objeto;

import javax.swing.ImageIcon;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.Visitor;

public class Lago extends Temporales{
	
	public Lago(Mapa m, Celda celda){
		mapa= m;
		celdaActual=celda;
		tiempo=2*tiempo;
		precio=20;
		imagen.setIcon(new ImageIcon(this.getClass().getResource("/img/lago.png")));

	}

	public void accept(Visitor v) {
		v.visit(this);
	}

}
