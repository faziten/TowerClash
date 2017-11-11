package Mapa;

import javax.swing.Icon;
import javax.swing.JLabel;

import Main.Visitor;

public abstract class ElementosMapa {
	protected int vida = 100;
	protected Celda celdaActual;	
	protected Mapa mapa;
	protected Visitor miVisitor;
	
	protected Icon imagen;
	protected JLabel mGrafico;
	
	public abstract void accept(Visitor v);

	
	public Visitor getVisitor()
	{
		return miVisitor;
	}
	
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
