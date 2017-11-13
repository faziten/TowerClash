package GUI;

import Mapa.Jugador;
import Mapa.Mapa;
import Objeto.Objeto;
import Unidades.*;

public class Logica_Mercado {
	
	private Jugador jug;
	private Mapa mapa;
	private Aliado aliado;
	
	public Logica_Mercado(Jugador j, Mapa m, Aliado a){
		jug=j;
		mapa=m;
		aliado=a;
	}
	
	//No se si asi deberia hacer esto, deberiamos ir testeando...
	public void comprarA(Aliado ali){
		mapa.agregarAliado(ali);
		jug.restarOro(aliado.getPrecio());
	}
	
	public void venderA(Aliado ali){
		mapa.removerAliado(ali);
		jug.agregarOro(aliado.getPrecio()/2);
		
	}
	
	//NEW
	public void comprarO(Objeto obj){
		mapa.agregarObjeto(obj);
		jug.restarOro(aliado.getPrecio());
	}
	
	
}
