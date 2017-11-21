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
	
	public void agregarPuntaje(int masPuntaje){
		puntaje+=masPuntaje;
	}
	
	public void agregarOro(int masOro){
		oro+=masOro;
	}
	
	
	public void restarOro(int menosOro){
		oro-=menosOro;
	}
	
	public Mapa getMapa(){
		return map;
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
	public LinkedList<Enemigo> getEnemigos(){
		 return misEnemigos;
	}
	

	public void crearHilos() {
		he = new HiloEnemigos(this);
		he.start();
	}
	
	public Enemigo crearEnemigo() {
		Random rnd = new Random();
		int fila = rnd.nextInt(6);
		int r = rnd.nextInt(100);		
		Enemigo e;
		if (r>=0 && r<25) {
			e = new Duende(map, new Celda(map, fila,0));
		} else if (r>=25 && r<45) {
			e = new Barbaro(map, new Celda(map, fila,0));
		} else if (r>=45 && r<65) {
			e = new Esqueleto(map, new Celda(map, fila,0));
		} else if (r>=65 && r<85) {
			e = new Pekka(map, new Celda(map, fila,0));
		} else if (r>=85 && r<95) {
			e = new Gigante(map, new Celda(map, fila,0));
		} else {
			e = new Chispitas(map, new Celda(map, fila,0));
		}
			agregarEnemigo(e);
			g.crearGrafico(e, fila, 0);
		return e;
	
	}
}

