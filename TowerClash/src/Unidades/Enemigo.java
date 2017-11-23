package Unidades;

import java.util.Random;

import Disparos.DisparoAliado;
import Disparos.DisparoEnemigo;
import Mapa.Jugador;

public abstract class Enemigo extends Unidad{
	public Enemigo(int x, int y, float maxVida, float daño, int velocidad, int valor) {
		super(x, y, maxVida, daño, velocidad, valor);
	}
		
	public void die() {
		Jugador.getInstance().eliminar(this);
		Random rnd = new Random();
		int r = rnd.nextInt(100);
		if (!Jugador.getInstance().hayPowerUpActivo() && r<50) {
			Jugador.getInstance().dropPowerUp(x, y);
		}	
		x = -1; 
		y = -1;
	}

	public boolean visit(EnemigoCerca e) {
		return false;
	}
	
	public boolean visit(EnemigoLejos e) {
		return false;
	}
	
	public boolean visit(DisparoEnemigo e) {
		return false;
	}
	
	public boolean visit(DisparoAliado d) {
		recibirDaño(d.getDaño());
		if (vida<=0) {
			die();
		}
		return true;
	}
	
	public void visit() {
	}
	
	public boolean visit(Unidad u) {
		return true;
	}
	
}
