package Mapa;

import javax.swing.Icon;
import javax.swing.JLabel;

import Visitor.Visitor;

public abstract class ElementosMapa {
	protected Celda celdaActual;	
	protected Mapa mapa;
	
	protected boolean estaVivo = true;
	
	protected Icon imagen;
	
	public abstract void accept(Visitor v);

	public Icon getImagen(){
		return imagen;
	}
	
	public Celda getCelda() {
		return celdaActual;
	}
	
	public void setCelda(Celda c) {
		celdaActual = c;
	}
}
