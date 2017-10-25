package Main;

import Objeto.*;
import PowerUp.*;
import Unidades.*;

public class VisitorEnemigo implements Visitor{
	
public VisitorEnemigo(){
		
	}

	public boolean visit(Duende duende) {
		duende.die();
		return true;
	}

	public boolean visit(Caballero caballero) {
		caballero.die();
		return true;
	}

	public boolean visit(Valquiria valquiria) {
		return false;
	}

	public boolean visit(Arquera arquera) {
		return false;
	}

	public boolean visit(Mago mago) {
		return false;
	}

	public boolean visit(Megacaballero megacaballero) {
		return false;
	}

	public boolean visit(Pekka pekka) {
		return false;
	}

	public boolean visit(Esqueleto esqueletos) {
		return false;
	}

	public boolean visit(Gigante gigante) {
		return false;
	}

	public boolean visit(Barbaro barbaro) {
		return false;
	}

	public boolean visit(Chispitas chispitas) {
		return false;
	}

	public boolean visit(Furia furia) {
		return false;
	}

	public boolean visit(Moneda moneda) {
		return false;
	}

	public boolean visit(Congelar congelar) {
		return false;
	}

	public boolean visit(Bomba bomba) {
		return false;
	}

	public boolean visit(Curacion curacion) {
		return false;
	}

	public boolean visit(Choza choza) {
		return false;
	}

	public boolean visit(Canon canon) {
		return false;
	}

	public boolean visit(Infernal infernal) {
		return false;
	}

	public boolean visit(Globo globo) {
		return false;
	}

	public boolean visit(Golem golem) {
		return false;
	}

	public boolean visit(Bola_Fuego bolaFuego) {
		return false;
	}

	public boolean visit(Misil misil) {
		return false;
	}

}
