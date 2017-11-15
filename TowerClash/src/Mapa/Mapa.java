package Mapa;

import java.util.LinkedList;

import Mapa.Celda;
import Objeto.Objeto;
import Unidades.Aliado;
import Unidades.Enemigo;

public class Mapa {
	private Celda mapa[][];
	private Jugador miJugador;
	private int ancho;
	private int largo;
	protected LinkedList<ElementosComprables> misComprables;
	protected LinkedList<Enemigo>  misEnemigos;

	public Mapa(Jugador j){
		ancho=6;
		largo=10;
		
		mapa = new Celda[ancho][largo];
		
		//Genero mi matriz de celdas.
		for(int x = 0; x <mapa.length ; x++){
			for(int y = 0; y < mapa[0].length; y++){
				mapa[x][y] = new Celda(this, x, y);
			}
		}
		misComprables= new LinkedList<ElementosComprables>(); 
		misEnemigos = new LinkedList<Enemigo>();
		
		miJugador=j;
	}
	
	public int getAncho() {
		return ancho;
	}

	public int getLargo() {
		return largo;
	}
	
	public Celda obtenerCelda(int x, int y){
		if((x < ancho) && (x >= 0) && (y < largo) && (y >= 0))
			return mapa[x][y];
		return null;
	}
	
	public Jugador getJugador(){
		return miJugador;
	}
	
	//Agregado por Tierno
//--------------------------------------------------------------------------------------------------------------------
	public void agregarElementoComprable(ElementosComprables a){
		if (a != null)
			misComprables.add(a);
	}
	
	public void removerElementoComprable(ElementosComprables a){
		if (a != null)
			misComprables.remove(a);
	}
	
	public void agregarEnemigo(Enemigo a){
		if (a != null)
			 misEnemigos.add(a);
	}
	
	public void removerEnemigo(Enemigo a){
		if (a != null)
			 misEnemigos.remove(a);
	}
	
	
}
