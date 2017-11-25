package Unidades;

import Disparos.DisparoCaballero;
import Disparos.DisparoEnemigo;
import Mapa.Jugador;

public abstract class Megacaballero extends Aliado {
	
	private Megacaballero mitad;

	public Megacaballero(int x, int y, float maxVida, float da�o, int velocidad, int costo) {
		super(x, y, maxVida, da�o, velocidad, costo);
	}

	protected void crearDisparo() {
		if (miPWTiempo!=null) {
			Jugador.getInstance().crearDisparo(new DisparoCaballero(x, y, miPWTiempo.getDa�o(da�o), miPWTiempo.getVelocidad(velocidad)));
		}
		else {
			Jugador.getInstance().crearDisparo(new DisparoCaballero(x, y, da�o, velocidad));
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
	
	public void recibirDa�o(float da�o) {
		super.recibirDa�o(da�o);
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
