package Unidades;

import Main.Visitor;
import Mapa.Celda;
import Mapa.Mapa;

public abstract class Unidad implements Runnable {
	protected int baseHP;
	protected int baseHPMaxima;
	protected int baseDamage;
	protected int rango;
	protected String nombre;
	protected Celda celdaActual;
	
	protected Celda getCeldaActual(){
		return celdaActual;
	}
	

	public int getHP(){
		return baseHP;
	}
	
	//Modifica la vida del elemento.
	public void setHp(int v){
		if(v>baseHPMaxima)
			baseHP=baseHPMaxima;
		else
			if(v<=0){
				baseHP=0;
				die();
			}
			else
				baseHP=v;
	}
	public int getBaseHp(){
		return baseHP;
	}
	
	abstract public void accept(Visitor v);
	abstract public void atacar();
	abstract public void die();
	
}
