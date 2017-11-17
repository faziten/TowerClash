package Mapa;

import javax.swing.JLabel;

import Visitor.Visitor;

public abstract class ElementosMapa {
	protected Celda celdaActual;	
	protected Mapa mapa;
	protected boolean estaVivo = true;
	protected JLabel imagen= new JLabel();
	
	public abstract void accept(Visitor v);

	public void setImagen(JLabel img){
		imagen=img;
	}
	
	public JLabel getImagen(){
		return imagen;
	}
	
	public Celda getCelda() {
		return celdaActual;
	}
	
	public void setCelda(Celda c) {
		celdaActual = c;
	}
	
	public void quitar(){
		if(imagen!=null){
			imagen.setIcon(null);
			imagen=null;
		}
		
		if(celdaActual!=null)
			celdaActual.removeElemento();
	}	

}
