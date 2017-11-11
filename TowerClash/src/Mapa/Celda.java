package Mapa;

import Unidades.Unidad;

public class Celda {
	
	private Unidad uni;
	private Mapa mapa;
	private int coordX;
	private int coordY;
	
	public Celda(Mapa map, int x, int y){
		mapa = map;
		coordX = x;
		coordY = y;
	}
	public int getCoordX() {
		return coordX;
	}

	public int getCoordY() {
		return coordY;
	}
	public Unidad getUnidad(){
		return uni;
	}

	public void setUnidad(Unidad unidad) {
		uni=unidad;
	}
	
	public Celda getSiguiente(int destino){
		return mapa.obtenerCelda(coordX+destino, coordY);
	}

	
	public boolean estaVacia(){
		return uni==null;
	}
	}