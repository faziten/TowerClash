package Objeto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.Timer;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.Visitor;

public class Lava extends Temporales{
	
	public Lava(Mapa m, Celda celda){
		mapa= m;
		celdaActual=celda;
		tiempo=8;
		precio=30;
		temporizador=new Timer(tiempo * 1000 ,  new ActionListener () 
		{ 
		    public void actionPerformed(ActionEvent e) 
		    {   
		    	estaVivo = true;
		    } 
		}); 
		temporizador.setRepeats(false);
		imagen.setIcon(new ImageIcon(this.getClass().getResource("/img/lava.png")));
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

}
