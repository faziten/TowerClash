package Mapa;

import Objeto.Objeto;
import PowerUps.PowerUp;
import Unidades.Enemigo;
import Unidades.Torre;
import Unidades.Unidad;

public class Mapa {
	protected int oro;
	protected int puntaje;
	protected int tiempo;
	protected volatile Celda[][] mapa;
	protected static final int x=32;
	protected static final int y=32;
	
	
	public Mapa(){
		//La idea es aplicar singleton, ya que vamos a tener solamente un diseño de mapa. MINGA!
		
		int[][] mapaPorDefecto={ 
				
				/*00*/	{2, 2, 9, 1, 1, 1, 1, 1, 1, 1,  1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 10, 2, } , 
				/*01*/	{2, 2, 2, 9, 1, 1, 1, 1, 1, 1,  1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 10, 2, 2, } , 
				/*02*/	{8, 2, 2, 2, 9, 1, 1, 1, 1, 1,  1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 10, 2, 2, 2, } , 
				/*03*/	{1, 8, 2, 2, 2, 9, 1, 1, 1, 1,  1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 10, 2, 2, 2, 7, } , 
				/*04*/	{1, 1, 8, 2, 2, 2, 9, 1, 1, 1,  1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 10, 2, 2, 2, 7, 1, } , 
				/*05*/	{1, 1, 1, 8, 2, 2, 2, 9, 1, 1,  1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 10, 2, 2, 2, 7, 1, 1, } , 
				/*06*/	{1, 1, 1, 1, 8, 2, 2, 2, 9, 1,  1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 10, 2, 2, 2, 7, 1, 1, 1, } , 
				/*07*/	{1, 1, 1, 1, 1, 8, 2, 2, 2, 9,  1, 1, 1, 1, 1, 6, 6, 6, 1, 1, 1, 1, 1, 10, 2, 2, 2, 7, 1, 1, 1, 1, } , 
				/*08*/	{1, 1, 1, 1, 1, 1, 8, 2, 2, 2,  9, 1, 1, 1, 1, 6, 6, 6, 1, 1, 1, 1, 10, 2, 2, 2, 7, 1, 1, 1, 1, 1, } , 
				/*09*/	{1, 1, 1, 1, 1, 1, 1, 8, 2, 2,  2, 9, 1, 1, 1, 6, 6, 6, 1, 1, 1, 10, 2, 2, 2, 7, 1, 1, 1, 1, 1, 1, } , 
				/*10*/	{1, 1, 1, 6, 6, 6, 1, 1, 8, 2,  2, 2, 9, 1, 1, 1, 1, 1, 1, 1, 10, 2, 2, 2, 7, 1, 6, 6, 6, 1, 1, 1, } , 
				/*11*/	{1, 1, 1, 6, 6, 6, 1, 1, 1, 8,  2, 2, 2, 9, 1, 1, 1, 1, 1, 10, 2, 2, 2, 7, 1, 1, 6, 6, 6, 1, 1, 1, } , 
				/*12*/	{1, 1, 1, 6, 6, 6, 1, 1, 1, 1,  8, 2, 2, 2, 9, 1, 1, 1, 10, 2, 2, 2, 7, 1, 1, 1, 6, 6, 6, 1, 1, 1, } , 
				/*13*/	{1, 1, 1, 1, 1, 1, 1, 1, 1, 1,  1, 8, 2, 2, 2, 9, 1, 10, 2, 2, 2, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, } ,  
				/*14*/	{1, 1, 1, 1, 1, 1, 1, 1, 1, 1,  1, 1, 8, 2, 2, 2, 6, 2, 2, 2, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, } , 
				/*15*/	{2, 2, 2, 2, 2, 2, 2, 2, 2, 2,  2, 2, 2, 2, 2, 6, 6, 6, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, } ,
				/*16*/	{2, 2, 2, 2, 2, 2, 2, 2, 2, 2,  2, 2, 2, 2, 6, 6, 6, 6, 6, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, } , 
				/*17*/	{2, 2, 2, 2, 2, 2, 2, 2, 2, 2,  2, 2, 2, 2, 2, 6, 6, 6, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, } , 
				/*18*/	{1, 1, 1, 1, 1, 1, 1, 1, 1, 1,  1, 1, 10, 2, 2, 2,6, 2, 2, 2, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, } , 
				/*19*/	{1, 1, 1, 1, 1, 1, 1, 1, 1, 1,  1, 10, 2, 2, 2, 7, 1, 8, 2, 2, 2, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, } , 
				/*20*/	{1, 1, 1, 6, 6, 6, 1, 1, 1, 1, 10, 2, 2, 2, 7, 1, 1, 1, 8, 2, 2, 2, 9, 1, 1, 1, 6, 6, 6, 1, 1, 1, } , 
				/*21*/	{1, 1, 1, 6, 6, 6, 1, 1, 1, 10, 2, 2, 2, 7, 1, 1, 1, 1, 1, 8, 2, 2, 2, 9, 1, 1, 6, 6, 6, 1, 1, 1, } , 
				/*22*/	{1, 1, 1, 6, 6, 6, 1, 1, 10, 2, 2, 2, 7, 1, 1, 1, 1, 1, 1, 1, 8, 2, 2, 2, 9, 1, 6, 6, 6, 1, 1, 1, } , 
				/*23*/	{1, 1, 1, 1, 1, 1, 1, 10, 2, 2, 2, 7, 1, 1, 1, 6, 6, 6, 1, 1, 1, 8, 2, 2, 2, 9, 1, 1, 1, 1, 1, 1, } , 
				/*24*/	{1, 1, 1, 1, 1, 1, 10, 2, 2, 2, 7, 1, 1, 1, 1, 6, 6, 6, 1, 1, 1, 1, 8, 2, 2, 2, 9, 1, 1, 1, 1, 1, } , 
				/*25*/	{1, 1, 1, 1, 1, 10, 2, 2, 2, 7, 1, 1, 1, 1, 1, 6, 6, 6, 1, 1, 1, 1, 1, 8, 2, 2, 2, 9, 1, 1, 1, 1, } , 
				/*26*/	{1, 1, 1, 1, 10, 2, 2, 2, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 2, 2, 2, 9, 1, 1, 1, } , 
				/*27*/	{1, 1, 1, 10, 2, 2, 2, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 2, 2, 2, 9, 1, 1, } , 
				/*28*/	{1, 1, 10, 2, 2, 2, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 2, 2, 2, 9, 1, } , 
				/*29*/	{1, 10, 2, 2, 2, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 2, 2, 2, 9, } , 
				/*30*/	{10, 2, 2, 2, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 2, 2, 2, } , 
				/*31*/	{2, 2, 2, 7, 1, 1, 1, 1, 1, 1,  1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 2, 2, } ,

				};
		
		mapa=new Celda[x][y];
		oro=0;
		puntaje=0;
		tiempo=0;
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				mapa[i][j]=new Celda(this,null,null, null,i,j,mapaPorDefecto[j][i]); //inicia la matriz con valores por defecto
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

}
