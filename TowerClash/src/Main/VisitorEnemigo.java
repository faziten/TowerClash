package Main;

import Mapa.Rey;
import Objeto.*;
import PowerUp.*;
import Unidades.*;

public class VisitorEnemigo implements Visitor{
	
	public VisitorEnemigo(){
		
	}

	//BORRAR
	public boolean visit(Duende duende) {
		duende.die();
		return true;
	}

	//BORRAR
	public boolean visit(Caballero caballero) {
		caballero.die();
		return true;
	}

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
	
	public void die(){
		
	}

	

}
