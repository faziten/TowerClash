package Mapa;

import javax.swing.Icon;
import javax.swing.JLabel;

import Visitor.Visitor;

public abstract class ElementosMapa {
	protected Celda celdaActual;	
	protected Mapa mapa;
	
	protected boolean estaVivo = true;
	
	protected Icon imagen;
	protected JLabel mGrafico;
	
	public abstract void accept(Visitor v);

	
	
	public JLabel getGrafico()
	{
		return mGrafico;
	}
	
	public Celda getCelda() {
		return celdaActual;
	}
	
	public void setCelda(Celda c) {
		celdaActual = c;
	}
}
