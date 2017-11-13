package Mapa;

import Objeto.*;
import Unidades.*;

public class CreadorConcreto implements CreadorElementosComprables{

	public Aliado crearArquera(Mapa m, Celda c) {
		return new Arquera(m,c);
	}

	public Aliado crearCaballero(Mapa m, Celda c) {
		return new Caballero(m,c);
	}

	public Aliado crearMago(Mapa m, Celda c) {
		return new Mago(m,c);
	}

	public Aliado crearMegacaballero(Mapa m, Celda c) {
		return new Megacaballero(m,c);
	}

	public Aliado crearValquiria(Mapa m, Celda c) {
		return new Valquiria(m,c);
	}

	public Objeto crearGlobo(Mapa m, Celda c) {
		return new Globo(m, c);
	}

	public Objeto crearGolem(Mapa m, Celda c) {
		return new Golem(m,c);
	}

	public Objeto crearLago(Mapa m, Celda c) {
		return new Lago(m,c);
	}

	public Objeto crearLava(Mapa m, Celda c) {
		return new Lava(m,c);
	}

}