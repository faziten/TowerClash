package PowerUp;

import Mapa.Celda;
import Mapa.Mapa;
import Visitor.VisitorBomba;

public class Bomba extends PowerUp{
	private int damage;
	
	public Bomba(Mapa m, Celda celda){
		damage=40;
		miVisitor= new VisitorBomba(this);
		
	}
	
	public int getDamage(){
		return damage;
	}
		

}
