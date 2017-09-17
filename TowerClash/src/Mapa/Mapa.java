package Mapa;

import Objeto.Objeto;
import PowerUps.PowerUp;
import Unidades.Enemigo;
import Unidades.Torre;
import Unidades.Unidad;

public class Mapa {
	private int oro;
	private int puntaje;
	private int tiempo;
	private Celda[][] mapa;
	
	
	public Mapa(){
		//La idea es aplicar singleton, ya que vamos a tener solamente un diseño de mapa. 
	}
	/**
	 * 
	 * @param x coordenada X
	 * @param y coordenada Y
	 * @param uni unidad a insertar
	 * @return
	 */
	public byte insertarUnidad(int x, int y, Unidad uni){
		//retorna un 0: Si la unidad fue incertada correctamente.
		//retorna un 1: Si no se pudo insertar la unidad.
		//retorna -1: Si ocurrio un error lógico.
		return -1;
	}
	/**
	 * Elimina la unidad del mapa en la coordenada pasada por parametro.
	 * @param x coordenada X
	 * @param y coordenada Y
	 */
	public byte eliminarUnidad(int x, int y){ 
		//retorna un 0: Si la unidad fue incertada correctamente.
		//retorna un 1: Si no se pudo insertar la unidad.
		//retorna -1: Si ocurrio un error lógico.
		return -1;
	}
	
	/**
	 * Hace aparecer un power up en la posicion preestablecida.
	 * @param up Power UP que aparece aleatoriamente (sin repeticion). 
	 */
	public byte aparecePowerUp(PowerUp up){
		//retorna un 0: Si la unidad fue incertada correctamente.
		//retorna un 1: Si no se pudo insertar la unidad.
		//retorna -1: Si ocurrio un error lógico.
		return -1;
	}
	 
	/**
	 * Obtiene el oro equivalente a la estructura vendidad.  
	 * @param torrevend Estructura vendida.
	 */
	
	public void venderEstructura(Torre torrevend){
		oro+=torrevend.obtenerPrecio();
	}
	
	/**
	 * Obtiene oro por una accion del jugador (matar enemigos, etc).
	 * @param ene Enemigo que murio. 
	 */
	public void recibirOro(Enemigo ene){
		oro+=ene.obtenerRecompensa();
		//NOTA: SINCRONIZAR MUERTE CON OBTENCION DE PARAMETROS.
	}
}
