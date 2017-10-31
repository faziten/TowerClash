package Main;

import Mapa.Rey;
import Objeto.Objeto;
import PowerUp.*;
import Unidades.*;

public class VisitorAliado implements Visitor{
	
	public VisitorAliado(){
		
	}
	
	//HAY QUE BORRAR
	public boolean visit(Duende duende) {
		duende.die();
		return true;
	}
	
	//HAY QUE BORRARLO
	public boolean visit(Caballero caballero) {
		//System.out.println("aca!");
		//caballero.die();
		return false;
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
	
	public boolean visit(Rey rey){
		return false;
	}


}
