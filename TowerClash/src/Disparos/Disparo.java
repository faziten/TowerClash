package Disparos;

import javax.swing.JLabel;
import Mapa.Celda;
import Mapa.Mapa;
import Visitor.Visitor;

public class Disparo {
	protected Celda celdaActual;
	protected Mapa mapa;
	protected JLabel imagen= new JLabel();
	protected int damage, velocidad;
	protected Visitor miVisitor;
	
	public Celda getCelda(){
		return celdaActual;
	}
	
	public JLabel getImagen(){
		return imagen;
	}
	
	public void setCelda(Celda c){
		celdaActual = c;
	}
	
	public void quitar(){
		if(imagen!=null)
		{
			imagen.setIcon(null);
			imagen=null;
		}
		
	}
	
	public int getDamage(){
		return damage;
	}

}