package Mapa;

import Unidades.Aliado;

public class Jugador {
	
	protected int oro;
	protected int puntaje;
	protected int tiempo; //esto debe ser un timer para a medida que pase el tiempo se vayan creando enemigos
	protected Mapa map; 
	
	public Jugador(int oro){
		this.oro=oro;
		puntaje=0;
		map= new Mapa(); 
	}
	
	public Jugador(){
		this(500);
	}
	
	//Estos metodos son mas que nada para que los use la GUI.
	public int getOro() {
		return oro;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public void setMonedas(int oro) {
		this.oro = oro;
	}
	
	public void setPuntos(int puntaje) {
		this.puntaje = puntaje;
	}

	
	public void agregarPuntaje(int masPuntaje){
		puntaje+=masPuntaje;
	}
	
	public void agregarOro(int masOro){
		oro+=masOro;
	}
	
	//Agregado por Tierno
//--------------------------------------------------------------------------------------------------------------------
	public void restarOro(int menosOro){
		oro-=menosOro;
	}

}
