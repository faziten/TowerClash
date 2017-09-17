package Main;
import Evento.*;
import Objeto.*;
import PowerUps.*;
import Unidades.*;

public interface Visitor {
	public boolean visit(Lava lava);
	public boolean visit(Lluvia lluvia);                     //
	public boolean visit(Tornado tornado);                   //			Puede que los hagamos con efectos gráficos solamente... 
	public boolean visit(Tsunami tsunami);                   //			No se si necesitan visitor siendo ese el caso.
	public boolean visit(Bola_Fuego bolaFuego);              //
	public boolean visit(Golem golem);
	public boolean visit(Misil misil);
	public boolean visit(Objeto objeto);
	public boolean visit(Bomba bomba); //para bailar esto es una bomba 
	public boolean visit(Congelar congelar);
	public boolean visit(Curacion curacion);
	public boolean visit(Furia furia);
	public boolean visit(Arquera arquera);
	public boolean visit(Barbaro barbaro);
	public boolean visit(Caballero caballero);
	public boolean visit(Canon canon);
	public boolean visit(Chispitas chispitas);
	public boolean visit(Choza choza);
	public boolean visit(Duende duente);
	public boolean visit(Esqueleto esqueleto);
	public boolean visit(Gigante gigante);
	public boolean visit(Infernal infernal);
	public boolean visit(Mago mago);
	public boolean visit(Magocaballero magocaballero);
	public boolean visit(Pekka pekka);
	public boolean visit(Rey rey);
	public boolean visit(Valquiria valquiria);
		
}
