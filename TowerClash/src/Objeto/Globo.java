package Objeto;

import javax.swing.ImageIcon;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.Visitor;

public class Globo extends ConVida {
	public Globo(Mapa m, Celda celda){
		mapa=m;
		celdaActual=celda;
		vida+=50;
		precio= 30;
		imagen.setIcon(new ImageIcon(this.getClass().getResource("/img/unidades/globo.png")));


	}

	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
