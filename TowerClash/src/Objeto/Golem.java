package Objeto;

import javax.swing.ImageIcon;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.Visitor;

public class Golem extends ConVida{
	public Golem(Mapa m, Celda celda){
		mapa=m;
		celdaActual=celda;
		vida+=100;
		precio=60;
		imagen.setIcon(new ImageIcon(this.getClass().getResource("/img/unidades/golem.png")));
	}

}
