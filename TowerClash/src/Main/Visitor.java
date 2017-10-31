package Main;


import Mapa.Rey;
import Objeto.*;
import PowerUp.*;
import Unidades.*;

public interface Visitor {
	
	public boolean visit(Aliado aliado);
	public boolean visit(Enemigo enemigo);
	public boolean visit(PowerUp pw);
	public boolean visit(Objeto obj);
	public boolean visit(Rey rey);
}
