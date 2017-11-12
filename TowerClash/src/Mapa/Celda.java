package Mapa;

import Unidades.Unidad;

public class Celda {
	
	private ElementosMapa misElementos;
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
	public ElementosMapa getElemento(){
		return misElementos;
	}

	public void setElemento(ElementosMapa e) {
		misElementos=e;
	}
	
	public Celda getSiguiente(int destino){
		return mapa.obtenerCelda(coordX+destino, coordY);
	}

	
	public boolean estaVacia(){
		return misElementos==null;
	}
}