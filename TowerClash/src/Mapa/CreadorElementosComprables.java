package Mapa;

import Mapa.Celda;
import Objeto.Objeto;
import Unidades.Aliado;

public interface CreadorElementosComprables {
	
	public Aliado crearArquera(Mapa m,Celda c);
	public Aliado crearCaballero(Mapa m, Celda c);
	public Aliado crearMago(Mapa m, Celda c);
	public Aliado crearMegacaballero(Mapa m, Celda c);
	public Aliado crearValquiria(Mapa m, Celda c);
	public Objeto crearGlobo(Mapa m, Celda c);
	public Objeto crearGolem(Mapa m, Celda c);
	public Objeto crearLago(Mapa m, Celda c);
	public Objeto crearLava(Mapa m, Celda c);

}
