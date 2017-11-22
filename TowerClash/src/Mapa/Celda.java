package Mapa;

public class Celda {
	
	private ElementosMapa misElementos;
	private Mapa mapa;
	
	public Celda(Mapa map){
		mapa = map;
	}
	
	public Celda(Mapa m, ElementosMapa en) {
		this(m);
		misElementos = en;
	}
	
	public ElementosMapa getElemento(){
		return misElementos;
	}

	public void setElemento(ElementosMapa e) {
		misElementos=e;
	}
	
}