package Mapa;

import java.util.LinkedList;
import java.util.Random;

import GUI.GUI;
import Unidades.*;
import Hilos.HiloEnemigos;
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

	protected LinkedList<ElementosComprables> misComprables;
	protected LinkedList<Enemigo>  misEnemigos;

	
	//Hilos
	private HiloEnemigos he;
	
	
	public Jugador(int oro, GUI gui){
		this.oro=oro;
		puntaje=0;
		map= new Mapa(this); 
		g=gui;
		misComprables= new LinkedList<ElementosComprables>();
		misEnemigos= new LinkedList<Enemigo>();

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
	
	public void agregarElementoComprable(ElementosComprables e){
		if (e!=null)
			misComprables.add(e);
	}
	
	public void eliminarElementoComprable(ElementosComprables e){
		if (e!=null)
			misComprables.add(e);
	}

	
	public void agregarEnemigo(Enemigo a){
		if (a != null)
			 misEnemigos.add(a);
	}
	
	public void removerEnemigo(Enemigo a){
		if (a != null)
			 misEnemigos.remove(a);
	}
	
	public Enemigo crearEnemigo() {
		Random rnd = new Random();
		int fila = rnd.nextInt(6);
		int r = rnd.nextInt(100);		
		Enemigo e=null;
		 if (r>=0 && r<50) {
			e = new Esqueleto(map, new Celda(map, fila,0));
		} else if (r>=50 && r<100) {
			e = new Pekka(map, new Celda(map, fila,0));
		} 	
		if(e != null){
			agregarEnemigo(e);
			g.crearGrafico(e, fila, 0);

		}
		return e;
	
	}
}

