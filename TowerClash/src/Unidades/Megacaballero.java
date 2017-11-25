package Unidades;

import Disparos.DisparoCaballero;
import Disparos.DisparoEnemigo;
import Mapa.Jugador;

public abstract class Megacaballero extends Aliado {
	
	private Megacaballero mitad;

	public Megacaballero(int x, int y, float maxVida, float daño, int velocidad, int costo) {
		super(x, y, maxVida, daño, velocidad, costo);
	}

	protected void crearDisparo() {
		if (miPWTiempo!=null) {
			Jugador.getInstance().crearDisparo(new DisparoCaballero(x, y, miPWTiempo.getDaño(daño), miPWTiempo.getVelocidad(velocidad)));
		}
		else {
			Jugador.getInstance().crearDisparo(new DisparoCaballero(x, y, daño, velocidad));
		}	
	}
	
	public void setMitad(Megacaballero mitad) {
		this.mitad = mitad;
	}
	
	public void actualizarVida(float vida) {
		this.vida = vida;
		if (this.vida<=0) {
			die();
		}
	}
	
	public void recibirDaño(float daño) {
		super.recibirDaño(daño);
		mitad.actualizarVida(vida);
	}
	
	public boolean visit(DisparoEnemigo d) {
		boolean toReturn = super.visit(d);
		mitad.actualizarVida(vida);
		return toReturn;
	}
	
	public boolean visit(EnemigoCerca e) {
		boolean toReturn = super.visit(e);
		mitad.actualizarVida(vida);
		return toReturn;
	}

}
