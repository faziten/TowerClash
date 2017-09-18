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

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Caballero extends Aliado {
	
	
	public Caballero(String nombre, Celda celda){
		this.nombre=nombre;
		this.arma=null;
		this.baseDamage=0;
		this.baseHP=0;
		this.nivel=0;
		this.rango=0;
		
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
	
	public void moverDerecha(){
		
		celdaActual.vaciarUnidad(); //libera posicion
		celdaActual.resetCode(); //vuelve a dibujar lo que estaba por defecto.
		
		celdaActual=celdaActual.obtenerDerecha(celdaActual);
		celdaActual.setUnidad(this);
		celdaActual.setCode(3);
		
		
	}
	public String getNombre(){
		return nombre;
	}
	//public String toString(){
	//	return "celda actual: "+celdaActual+" nombre: "+nombre;
	//}
	
	
	
	@Override
	public synchronized void run() {
		//HACER ALGO ACA
			moverDerecha();
			try {
				Thread.sleep(101);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
}
