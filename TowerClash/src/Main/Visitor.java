package Main;

import Objeto.*;
import PowerUp.*;
import Unidades.*;

public interface Visitor {
	
	public boolean visit(Valquiria valquiria);
	public boolean visit(Caballero caballero);
	public boolean visit(Arquera arquera);
	public boolean visit(Mago mago);
	public boolean visit(Megacaballero megacaballero);
	public boolean visit(Pekka pekka);
	public boolean visit(Esqueleto esqueletos);
	public boolean visit(Duende duende);
	public boolean visit(Gigante gigante);
	public boolean visit(Barbaro barbaro);
	public boolean visit(Chispitas chispitas);
	public boolean visit(Furia furia);
	public boolean visit(Moneda moneda);
	public boolean visit(Congelar congelar);
	public boolean visit(Bomba bomba);
	public boolean visit(Curacion curacion);
	public boolean visit(Choza choza);
	public boolean visit(Canon canon);
	public boolean visit(Infernal infernal);
	public boolean visit(Globo globo);
	public boolean visit(Golem golem);
	public boolean visit(Bola_Fuego bolaFuego);
	public boolean visit(Misil misil);
	

}
