package Mapa;

import javax.swing.Icon;

import Objeto.*;
import Unidades.*;

import Mapa.Celda;

public abstract class Mapa {
	private Celda mapa[][];
	public static int ANCHO = 9;
	public static int ALTO = 5;
	public static int EJE = 64;
	protected Icon icono;

	protected Mapa(){
		mapa = new Celda[10][6];
		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa[0].length; j++) {
				mapa[i][j] = new Celda(this);
			}
		}
	}
	
	public void eliminarElementoMapa(ElementosMapa e) {
		if (mapa[e.getX()/EJE][e.getY()/EJE].getElemento()==e) {
			mapa[e.getX()/EJE][e.getY()/EJE].setElemento(null); 
		}
		if ((e.getX()/EJE-1>=0) && mapa[e.getX()/EJE-1][e.getY()/EJE].getElemento()==e) {
			mapa[e.getX()/EJE-1][e.getY()/EJE].setElemento(null); 
		}		
	}

	public void setElementoMapa(Aliado n) {
		mapa[n.getX()/EJE][n.getY()/EJE].setElemento(n);
	}

	public void setEntidad(Enemigo e) {
		if (e.getX()/EJE<mapa.length && e.getX()>=0) {
			mapa[e.getX()/EJE][e.getY()/EJE].setElemento(e);
			if (e.getX()>EJE && mapa[e.getX()/EJE-1][e.getY()/EJE].getElemento()==e) {
				mapa[e.getX()/EJE-1][e.getY()/EJE].setEntidad(null);
			}			
		}	
	}
	
	public void setEntidad(Objeto o) {
		mapa[o.getX()/EJE][o.getY()/EJE].setElemento(o);
	}

	public ElementosMapa getEntidad(int x, int y) {
		return mapa[x][y].getElemento();
	}

	public abstract Mapa reiniciarLevel(boolean completado);

	public Icon getIcono() {
		return icono;
	}
	
}
