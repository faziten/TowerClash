package Unidades;

import PowerUp.PowerUp;
import Visitor.Visitor;
import Visitor.VisitorEnemigo;

public abstract class Enemigo extends Unidad{
	protected int velocidad = 2;
	protected int puntaje = 50;
	protected int recompensa = 100;
	protected PowerUp miPw;
	protected boolean llegoFinal = false;
	
	
	public void actualizarOroPuntaje() {
		mapa.getJugador().agregarPuntaje(puntaje);
		mapa.getJugador().agregarOro(recompensa);
	}
	
	public void setVisitor(VisitorEnemigo v){
		miVisitor = v;
	}
	
	public void accept(Visitor v){
		v.visit(this);
	}
	
	public void mover()
	{		
			
	}
	
	public void setVelocidad(int v) {
		velocidad = v;
	}
	
}
