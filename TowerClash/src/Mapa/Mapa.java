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
	

	
	
}
