package Objeto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.Timer;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.Visitor;

public class Lago extends Temporales{
	
	public Lago(Mapa m, Celda celda){
		mapa= m;
		estaVivo=false;
		celdaActual=celda;
		tiempo=3;
		precio=20;
		imagen.setIcon(new ImageIcon(this.getClass().getResource("/img/lago.png")));
		temporizador=new Timer(tiempo * 1000 ,  new ActionListener () 
		{ 
		    public void actionPerformed(ActionEvent e) 
		    {   
		    	estaVivo = true;
		    } 
		}); 
		temporizador.setRepeats(false);
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

}
