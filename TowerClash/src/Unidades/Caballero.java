package Unidades;

import Main.*;
import Mapa.Celda;
//import PowerUps.DefaultAliado;

public class Caballero extends Aliado{
	
	
	public Caballero(String nombre, Celda celda){
		this.nombre=nombre;
		this.baseDamage=20;
		this.baseHP=80;
		this.baseHPMaxima=80;
		this.rango=1;
		this.celdaActual=celda;
		this.precio=140;
		//No se si va esto.
		celdaActual.setUnidad(this);
		//Si se acepta mi mapa y celda.
			
		//this.pw= new DefaultAliado(baseDamage);
		
	}
	
	public String getNombre(){
		return nombre;
	}
	
	//borrar
	
	public void moverDerecha(){
		celdaActual.setCode(-1, 3, -1, -1);
		Celda siguiente=celdaActual.obtenerDerecha(celdaActual);
		siguiente.accept(new VisitorAliado());
		//celdaActual.vaciarUnidad(); //libera posicion
		//celdaActual.setCode(-1, 0, -1, -1);; //vuelve a dibujar lo que estaba por defecto hay que implementar una lectura de codigo para reescribir el que estaba antes y no el por defecto.
		
		
		//celdaActual=celdaActual.obtenerDerecha(celdaActual); //DESPLAZA
		
		//celdaActual.setUnidad(this);
		celdaActual.setCode(-1, 3, -1, -1);
		celdaActual.accept(new VisitorAliado());
		
		siguiente.accept(new VisitorAliado());
		
	}
	public synchronized void die(){  //tuve que sincronizarlo para que no me queden cadaveres en el mapa jaja. 
		celdaActual.setCode(-1, 5, -1, -1);
		celdaActual.setUnidad(null);
		celdaActual=null;
		System.out.println(nombre+ ": ouch!");
	}

	public void run() {
		moverDerecha(); //Borrar
		
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

	public void atacar() {
		
	}


	public void recibirAtaque() {

		
	}
}
