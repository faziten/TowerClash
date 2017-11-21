package Unidades;

import Mapa.Celda;
import Mapa.ElementosMapa;
import PowerUp.PowerUp;
import Visitor.Visitor;

public abstract class Enemigo extends ElementosMapa{
	protected int velocidad = 2;
	protected int puntaje = 50;
	protected int recompensa = 100;
	protected PowerUp miPw;
	protected boolean llegoFinal = false;
	protected int vida = 100;

	protected int damage = 10;
	protected int rango = 1;
	protected Visitor miVisitor;
	
	
	public void actualizarOroPuntaje() {
		mapa.getJugador().agregarPuntaje(puntaje);
		mapa.getJugador().agregarOro(recompensa);
	}
	
	public void accept(Visitor v){
		v.visit(this);
	}
	
	public void mover(Celda celda){	
		
		int i=160;
		while(i < 400){
			i=i+30;
			//celda.getElemento().getCelda()[fila][col].setBounds(i, col, 75, 75);
			
		}
	}
	
	public int getVida(){
		return vida;
	}

	public int getAlcance(){
		return rango;
	}
		
	public int getDamage(){
		return damage;
	}
		
	public boolean estaVivo(){
		return estaVivo;
	}
		
	public void setVida(int v){
		vida = v;
	}

	public void morir(boolean b) {
		estaVivo = b;
	}
	
	public Visitor getVisitor(){
		return miVisitor;
	}

	public PowerUp generarPowerUp(){
		return null; 
	}
}
