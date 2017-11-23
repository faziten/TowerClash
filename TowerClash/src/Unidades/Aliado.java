package Unidades;

import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import Mapa.ElementosMapa;
import Mapa.Jugador;
import Mapa.Mapa;

public abstract class Aliado extends Unidad{

	protected int rango;

	public Aliado(int x, int y, float maxVida, float daño, int velocidad, int valor) {
		super(x, y, maxVida, daño, velocidad, valor);
		rango = Mapa.ANCHO;
	}
	
	public void accion() {
		ElementosMapa e = null;
		boolean encontre = false;
		int i = 1;
		while (!encontre && i<=rango && (x/Mapa.EJE-i>=0)) {
			e = Jugador.getInstance().getElemento(x/Mapa.EJE-i, y/Mapa.EJE);
			if (e!=null) {
				encontre = e.visit(this);
			}	
			i++;
		}
		if (encontre) {
			crearDisparo();
		}
	}	
	
	public void die() {
		Jugador.getInstance().eliminar(this);
	}
	
	protected abstract void crearDisparo();
		
	public boolean visit(EnemigoCerca e) {
		recibirDaño(e.getDaño()/8);
		return true;
	}
	
	public boolean visit(EnemigoLejos e) {
		return true;
	}
	
	public boolean visit(DisparoAliado d) {
		return false;
	}
	
	public boolean visit(DisparoEnemigo d) {
		recibirDaño(d.getDaño());
		if (vida<=0) {
			die();
		}
		return true;
	}
	
	public void visit() {
		Jugador.getInstance().venderUnidad(this);
	}
	
	public boolean visit(Unidad u) {
		return false;
	}
	

}
