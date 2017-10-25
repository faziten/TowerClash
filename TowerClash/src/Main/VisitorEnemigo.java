package Main;

import Unidades.Caballero;
import Unidades.Duende;

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

}
