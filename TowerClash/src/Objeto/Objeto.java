package Objeto;

import Disparos.DisparoAliado;
import Mapa.ElementosMapa;
import Mapa.Jugador;
import Unidades.Unidad;

public abstract class Objeto extends ElementosMapa {	
	protected int costo;

	public Objeto(int x, int y, int costo) {
		super(x, y);
		this.costo = costo;
	}	

	public boolean visit(Unidad u) {
		return false;
	}

	public boolean visit(DisparoAliado d) {
		return false;
	}	

	public void die() {
		Jugador.getInstance().eliminarObjeto(this);
	}

	public void visit() {}


	public int getValor() {
		return costo;
	}
	

	

}
