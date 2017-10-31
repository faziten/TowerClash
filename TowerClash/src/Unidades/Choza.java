package Unidades;

import Main.Visitor;
import Mapa.Celda;

public class Choza extends Estructura{
	
	public Choza(String nom, Celda celdaAc1,Celda celdaAc2){}

	public void run() {
		
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

	public void atacar() {
	}
	
public void recibirAtaque() {
		
	}

	public void die() {
		
	}

}
