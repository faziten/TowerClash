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
		private int carril;
		Sonidor sonidor=new Sonidor();
		
		
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
	 * 
	 * @param c Celda destino del caballero. GENERICO. Asume que la celda existe.
	 */
	public void moverACelda(Celda c){
		celdaActual.vaciarUnidad(); //libera posicion
		celdaActual.setCode(-1, 0, -1, -1);; //vuelve a dibujar lo que estaba por defecto hay que implementar una lectura de codigo para reescribir el que estaba antes y no el por defecto.
		
		celdaActual=c;
		celdaActual.setUnidad(this);
		celdaActual.setCode(-1, 3, -1, -1);
		//sonidor.playSound("grass_footstep");
	}
	
	/**
	 * Mueve el Caballero a derecha. [Definir que ocurre si se encuentra al borde del mapa].
	 */
	public void moverDerecha(){
		
		celdaActual.vaciarUnidad(); //libera posicion
		celdaActual.setCode(-1, 0, -1, -1);; //vuelve a dibujar lo que estaba por defecto hay que implementar una lectura de codigo para reescribir el que estaba antes y no el por defecto.
		
		celdaActual=celdaActual.obtenerDerecha(celdaActual);
		celdaActual.setUnidad(this);
		celdaActual.setCode(-1, 3, -1, -1);
		//sonidor.playSound("grass_footstep");
		
	}
	public void moverAbajo(){
		celdaActual.vaciarUnidad(); //libera posicion
		celdaActual.resetCode(); //vuelve a dibujar lo que estaba por defecto hay que implementar una lectura de codigo para reescribir el que estaba antes y no el por defecto.
		
		celdaActual=celdaActual.obtenerAbajo(celdaActual);
		celdaActual.setUnidad(this);
		celdaActual.setCode(-1, 3, -1, -1);;
		//sonidor.playSound("grass_footstep");
		
	}
	


	

	/**
	 * Este metodo elimina la vinculación de éste caballero con la celda donde estaba.
	 */
	public synchronized void die(){  //tuve que sincronizarlo para que no me queden cadaveres en el mapa jaja. 
		celdaActual.setCode(-1, 5, -1, -1);
		celdaActual.setUnidad(null);
		celdaActual=null;
	}
	public synchronized void setCarril(int carril){
		this.carril=carril;
	}
	
	@Override
	public synchronized void run() {
		
		
		//while(true){	
		switch(direccion){
		case "derecha":{
			moverDerecha();
			break;
			}
		case "abajo":{
			moverAbajo();
			break;
			}
		case "camino1":{
			if(carril==1)
				moveteChiquitaMovete(1, 0);
			else 
				if(carril==2)
					moveteChiquitaMovete(0, 0);
				else 
					moveteChiquitaMovete(0, 1);
			break;
		}
		case "camino2":{
			if(carril==1)
				moveteChiquitaMovete(31, 0);
			else 
				if(carril==2)
					moveteChiquitaMovete(31, 1);
				else 
					moveteChiquitaMovete(31, 2);
			break;
		}
		case "camino4":{
			if(carril==1)
				moveteChiquitaMovete(30, 31);
			else 
				if(carril==2)
					moveteChiquitaMovete(31, 31);
				else 
					moveteChiquitaMovete(31, 30);
			break;
		}
		case "camino3":{
			if(carril==1)
				moveteChiquitaMovete(31, 15);
			else 
				if(carril==2)
					moveteChiquitaMovete(31, 16);
				else 
					moveteChiquitaMovete(31, 17);
			break;
		}
		case "camino5":{
			if(carril==1)
				moveteChiquitaMovete(0, 31);
			else 
				if(carril==2)
					moveteChiquitaMovete(1, 31);
				else 
					moveteChiquitaMovete(2, 31);
			break;
		}
		case "camino6":{
			if(carril==1)
				moveteChiquitaMovete(0, 15);
			else 
				if(carril==2)
					moveteChiquitaMovete(0, 16);
				else 
					moveteChiquitaMovete(0, 17);
			break;
		}
		
		
		
		}
		
		
		}
	//}


}
