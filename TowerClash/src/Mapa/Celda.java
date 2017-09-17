package Mapa;

import Evento.Evento;
import Objeto.Objeto;
import Unidades.Unidad;
/**
 * 
 * @author Faccio
 * @author Fernandez
 * @author Orellano
 *
 */
public class Celda {
	protected Mapa map;
	protected Objeto obj;
	protected Evento eve;
	protected Unidad uni;
	protected byte coordX;
	protected byte coordY;
	
	
	/**
	 * Construye una celda con todos los parametros
	 * @param m mapa
	 * @param o objeto 
	 * @param e evento
	 * @param u unidad
	 */
	public Celda(Mapa m, Objeto o, Evento e, Unidad u){
		map=m;
		obj=o;
		eve=e;
		uni=u;
		
		//Nota: Si la cagamos tira ClassCastExc.
	}
	/**
	 * Construye una celda con solo el mapa pasado por parámetro.
	 * @param m mapa
	 */
	public Celda(Mapa m){
		new Celda(m, null, null, null);
	}
}
