package Mapa;

import java.util.Random;

import GUI.GUI;
import Unidades.*;
import Hilos.HiloEnemigos;
import Mapa.*;

public class Jugador {
	
	protected int oro;
	protected int puntaje;
	protected int tiempo; //esto debe ser un timer para a medida que pase el tiempo se vayan creando enemigos
	protected Mapa map; 
	protected GUI g;
	
	//Hilos
	private HiloEnemigos he;
	
	
	public Jugador(int oro, GUI gui){
		this.oro=oro;
		puntaje=0;
		map= new Mapa(this); 
		g=gui;
	}
	
	public Jugador(GUI GUI){
		this(200, GUI);
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
	
	public Mapa getMapa(){
		return map;
	}
	
	//Agregado por Tierno
//--------------------------------------------------------------------------------------------------------------------
	public void restarOro(int menosOro){
		oro-=menosOro;
	}

	public void crearHilos() {
		he = new HiloEnemigos(this);
		he.start();
	}
	
	public Enemigo crearEnemigo() {
		Random rnd = new Random();
		int fila = rnd.nextInt(6);
		int r = rnd.nextInt(100);		
		Enemigo e=null;
		 if (r>=45 && r<65) {
			e = new Esqueleto(map, new Celda(map, 2,2));
		} else if (r>=65 && r<85) {
			e = new Pekka(map, new Celda(map, 2,3));
		} 	
		if(e != null){
			map.agregarEnemigo(e);
			g.crearGrafico(e.getImagen());
		}
		return e;
	}
}
