package Unidades;

import Evento.Lava;
import Evento.Lluvia;
import Evento.Tornado;
import Evento.Tsunami;
import GUI.Sonidor;
import Main.Visitor;
import Mapa.Celda;
import Objeto.Bola_Fuego;
import Objeto.Golem;
import Objeto.Misil;
import Objeto.Objeto;
import PowerUps.Bomba;
import PowerUps.Congelar;
import PowerUps.Curacion;
import PowerUps.Furia;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Caballero extends Aliado {
		private int velocidad;
		private String direccion;
		Sonidor sonidor=new Sonidor();
		private int puntos;
	public Caballero(String nombre, Celda celda){
		this.nombre=nombre;
		this.arma=null;
		this.baseDamage=0;
		this.baseHP=0;
		this.nivel=0;
		this.rango=0;
		this.puntos=25;
		this.celdaActual=celda;
		
		celdaActual.setUnidad(this);
		
		
		
	}
	
	protected void setArma() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean visit(Lava lava) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Lluvia lluvia) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Tornado tornado) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Tsunami tsunami) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Bola_Fuego bolaFuego) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Golem golem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Misil misil) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Objeto objeto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Bomba bomba) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Congelar congelar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Curacion curacion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Furia furia) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Arquera arquera) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Barbaro barbaro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Caballero caballero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Canon canon) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Chispitas chispitas) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Choza choza) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Duende duente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Esqueleto esqueleto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Gigante gigante) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Infernal infernal) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Mago mago) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Magocaballero magocaballero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Pekka pekka) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Rey rey) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visit(Valquiria valquiria) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subirNivel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int obtenerNivel() {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * Mueve el Caballero a derecha. [Definir que ocurre si se encuentra al borde del mapa].
	 */
	public void moverDerecha(){
		
		celdaActual.vaciarUnidad(); //libera posicion
		celdaActual.resetCode(); //vuelve a dibujar lo que estaba por defecto hay que implementar una lectura de codigo para reescribir el que estaba antes y no el por defecto.
		
		celdaActual=celdaActual.obtenerDerecha(celdaActual);
		celdaActual.setUnidad(this);
		celdaActual.setCode(3);
		//sonidor.playSound("grass_footstep");
		
	}
	public void moverAbajo(){
		celdaActual.vaciarUnidad(); //libera posicion
		celdaActual.resetCode(); //vuelve a dibujar lo que estaba por defecto hay que implementar una lectura de codigo para reescribir el que estaba antes y no el por defecto.
		
		celdaActual=celdaActual.obtenerAbajo(celdaActual);
		celdaActual.setUnidad(this);
		celdaActual.setCode(3);
		//sonidor.playSound("grass_footstep");
		
	}
	public synchronized String getNombre(){
		return nombre;
	}
	//public String toString(){
	//	return "celda actual: "+celdaActual+" nombre: "+nombre; //STACK OVERFLOW 
	//}
	
	public synchronized void setVelocidad(int vel){
		velocidad=vel;
	}
	public synchronized void setDireccion(String dir){
		direccion=dir;
	}
	
	public int getPuntos(){
		return puntos;
	}
	/**
	 * Este metodo elimina la vinculación de éste caballero con la celda donde estaba.
	 */
	public synchronized void die(){  //tuve que sincronizarlo para que no me queden cadaveres en el mapa jaja. 
		celdaActual.resetCode();
		celdaActual.setUnidad(null);
		celdaActual=null;
	}
	
	@Override
	public synchronized void run() {
		//while(true){	
		switch(direccion){
		case "derecha":{
			moverDerecha();
			//try {
				//System.out.println(Thread.currentThread().getName()+ " Hilo de Caballero "+nombre);
				//Thread.sleep(velocidad);
			//} catch (InterruptedException e) {
				//e.printStackTrace();
				//}
			break;
			}
		case "abajo":{
			moverAbajo();
			//try {
				//System.out.println(Thread.currentThread().getName()+ " Hilo de Caballero "+nombre);
				//Thread.sleep(velocidad);
			//} catch (InterruptedException e) {
				//e.printStackTrace();
				//}
			break;
			}
		
		}
		
		
		}
	//}
}
