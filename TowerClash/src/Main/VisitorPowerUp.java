package Main;

import Mapa.Rey;
import Objeto.Objeto;
import PowerUp.PowerUp;
import Unidades.Aliado;
import Unidades.Enemigo;

public class VisitorPowerUp implements Visitor{

	public boolean visit(Aliado aliado) {
		return false;
	}

	public boolean visit(Enemigo enemigo) {
		return false;
	}

	public boolean visit(PowerUp pw) {
		return false;
	}

	public boolean visit(Objeto obj) {
		return false;
	}

	public boolean visit(Rey rey) {
		return false;
	}

}
