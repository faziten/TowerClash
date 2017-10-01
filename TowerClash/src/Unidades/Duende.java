package Unidades;

import Evento.Lava;
import Evento.Lluvia;
import Evento.Tornado;
import Evento.Tsunami;
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

public class Duende extends Enemigo{
	private int carril;
	private String direccion;
	public Duende(String nombre, Celda celda){
	this.nombre=nombre;
	this.arma=null;
	this.baseDamage=0;
	this.baseHP=0;
	this.nivel=0;
	this.rango=0;
	this.puntos=100;
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
	
	public void moverIzquierda(){
		
		celdaActual.vaciarUnidad(); //libera posicion
		celdaActual.setCode(-1, 0, -1, -1);; //vuelve a dibujar lo que estaba por defecto hay que implementar una lectura de codigo para reescribir el que estaba antes y no el por defecto.	
		celdaActual=celdaActual.obtenerIzquierda(celdaActual);
		celdaActual.setUnidad(this);
		celdaActual.setCode(-1, 4, -1, -1);		
	}

	public synchronized String getNombre(){
		return nombre;
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
		celdaActual.setCode(-1, 11, -1, -1);
		celdaActual.setUnidad(null);
		celdaActual=null;
	}

	public synchronized void setCarril(int carril){
		this.carril=carril;
	}
	
	public synchronized void run() {
		//while(true){	
				switch(direccion){
				case "izquierda":{
					moverIzquierda();
					break;
					}
				case "abajo":{
					//moverAbajo();
					break;
					}
				case "camino4":{
					if(carril==1)
						moveteChiquitaMovete(17, 18);
					else 
						if(carril==2)
							moveteChiquitaMovete(18, 18);
						else 
							moveteChiquitaMovete(18, 17);
					break;
				}
				case "camino5":{
					if(carril==1)
						moveteChiquitaMovete(17, 14);
					else 
						if(carril==2)
							moveteChiquitaMovete(18, 14);
						else 
							moveteChiquitaMovete(18, 15);
					break;
				}
				case "camino1":{
					if(carril==1)
						moveteChiquitaMovete(15, 14);
					else 
						if(carril==2)
							moveteChiquitaMovete(14, 14);
						else 
							moveteChiquitaMovete(14, 15);
					break;
				}
				case "camino6":{
					if(carril==1)
						moveteChiquitaMovete(13, 15);
					else 
						if(carril==2)
							moveteChiquitaMovete(13, 16);
						else 
							moveteChiquitaMovete(13, 17);
					break;
				}
				case "camino2":{
					if(carril==1)
						moveteChiquitaMovete(14, 17);
					else 
						if(carril==2)
							moveteChiquitaMovete(14, 18);
						else 
							moveteChiquitaMovete(15, 18);
					break;
				}
				case "camino3":{
					if(carril==1)
						moveteChiquitaMovete(19, 15);
					else 
						if(carril==2)
							moveteChiquitaMovete(19, 16);
						else 
							moveteChiquitaMovete(19, 17);
					break;
				}
				
				
				
				}	
	}
}
