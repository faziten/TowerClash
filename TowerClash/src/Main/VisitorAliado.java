package Main;

import Unidades.Caballero;
import Unidades.Duende;

public class VisitorAliado implements Visitor{
	
	public VisitorAliado(){
		
	}

	@Override
	public boolean visit(Duende duende) {
		duende.die();
		return true;
	}

	@Override
	public boolean visit(Caballero caballero) {
		//System.out.println("aca!");
		//caballero.die();
		return false;
	}

}
