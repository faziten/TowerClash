package Mapa;

import Objeto.Objeto;
import PowerUps.PowerUp;
import Unidades.Enemigo;
import Unidades.Torre;
import Unidades.Unidad;

public class Mapa extends Thread {
	private int oro;
	private int puntaje;
	private int tiempo;
	private volatile Celda[][] mapa;
	private static final int x=32;
	private static final int y=32;
	
	
	public Mapa(){
		//La idea es aplicar singleton, ya que vamos a tener solamente un diseño de mapa. 
		mapa=new Celda[x][y];
		oro=0;
		puntaje=0;
		tiempo=0;
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				mapa[i][j]=new Celda(this,null,null, null,i,j,1); //inicia la matriz con valores por defecto
			}
		}
	
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
	/**
	 * Permite obtener la celda en la posicion pasada por parametro. 
	 * @param x parametro de columna
	 * @param y parametro de fila
	 * @return celda en la fila x columna y
	 */
	public Celda obtenerCelda(int x, int y){
		return mapa[x][y];
	}
	/**
	 * Metodo de DEBUG
	 * @return retorna los codigos almacenados en la matriz
	 */
	public String printCodes(){
		String salida="Estado interno de Matriz";
		for(int i=0;i<x;i++){
			salida+="\n";
			for(int j=0;j<y;j++)
				salida+=mapa[j][i].obtenerCode()+" ";
			}
		return salida;
	}
	/**
	 * Retorna el ancho de la matriz
	 * @return ancho
	 */
	public int obtenerAncho(){
		return x;
	}
	/**
	 * Retorna el alto de la matriz
	 * @return alto
	 */
	public int obtenerAlto(){
		return y;
	}
	/**
	 * Ejecuta acciones necesarias al hilo (Sync)
	 */
	public synchronized void run() {
		
		
	}
}
