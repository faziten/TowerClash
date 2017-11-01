package Mapa;

import java.util.Random;

import Main.Visitor;
import Objeto.Objeto; //cosas q el usuario puede comprar.
import Unidades.Caballero;
import Unidades.Duende;
import Unidades.Unidad;
/**
 * 
 * @author Faccio
 * @author Fernandez Tierno 
 * @author Orellano
 *
 */


public class Celda {
	protected Mapa map;
	protected Objeto obj;
	protected Unidad uni;
	protected int coordX;
	protected int coordY;
	protected int[] code;
	
	
	/**
	 * Construye una celda con todos los parametros
	 * @param m mapa
	 * @param o objeto 
	 * @param e evento
	 * @param u unidad
	 */
	public Celda(Mapa m, Objeto o, Unidad u, int x, int y, int code){
		map=m;
		obj=o;
		uni=u;
		coordX=x;
		coordY=y;
		this.code=new int[4];
		this.code[0]=code;
		//Nota: Si la cagamos tira ClassCastExc.
	}
	/**
	 * Construye una celda con solo el mapa pasado por parámetro.
	 * @param m mapa
	 */
	
	public Celda(Mapa m, int x, int y){
		new Celda(m, null, null, x, y, 0);
	}
	
	/**
	 * Que tal si hago un arreglo de codigos. Posiciones: 0=fondo; 1=unidad; 2=powerUp; 3= evento;
	 * @return codigos
	 */
	
	public int[] obtenerCode(){
		return code;
	}
	/**
	 * 
	 * @param fondo codigo de fondo
	 * @param unidad codigo de unidad
	 * @param powUp codigo de power up
	 * @param evento codigo de evento
	 */
	public void setCode(int fondo, int unidad, int powUp, int evento){
		//System.out.println("SETIE CODE EN "+code+" DE "+this);
		//System.out.ln(map.printCodes());
		if(fondo!=-1)
			code[0]=fondo;
		if(unidad!=-1)
			code[1]=unidad;
		if(powUp!=-1)
			code[2]=powUp;
		if(evento!=-1)
			code[3]=evento;
		
	    	
	}
	
	public int obtenerCoordX(){
		return coordX;
	}
	
	public int obtenerCoordY(){
		return coordY;
	}
	
	/**
	 * Metodo mega abstraido que se usa en los caminos para pedir la celda necesaria. Dado que las celdas conocen al mapa es el nexo perfecto. 
	 * NO CHEQUEO CORRECTITUD DE LOS PARAMETROS, SERA COSA DEL CLIENTE.
	 * @param x coordenada de la celda deseada.
	 * @param y coordenada de la celda deseada.
	 * @return celda deseada.
	 */
	public Celda obtenerCeldaDestino(int x, int y){
		return map.obtenerCelda(x, y);
	}
	

	public Celda obtenerDerecha(Celda cel){
		//System.out.println(cel.coordX+" "+map.obtenerAncho());
		if(cel.coordX<map.obtenerAncho()-1){
			
			return map.obtenerCelda(cel.coordX+1, cel.coordY);
			//return map.obtenerCelda(new Random().nextInt(31), new Random().nextInt(31));
			}
		else {	
			//return map.obtenerCelda(new Random().nextInt(31), new Random().nextInt(31));
			return map.obtenerCelda(0, cel.coordY);
		
		}
	}
	public Celda obtenerIzquierda(Celda cel){

		if(cel.coordX>0){
			
			return map.obtenerCelda(cel.coordX-1, cel.coordY);
			}
		else {	
			return map.obtenerCelda(31, cel.coordY);
		
		}
	}
	public Celda obtenerAbajo(Celda cel){
		//System.out.println(cel.coordX+" "+map.obtenerAncho());
		if(cel.coordY<map.obtenerAlto()-1){
			
			return map.obtenerCelda(cel.coordX, cel.coordY+1);
			//return map.obtenerCelda(new Random().nextInt(31), new Random().nextInt(31));
			}
		else {	
			//return map.obtenerCelda(new Random().nextInt(31), new Random().nextInt(31));
			return map.obtenerCelda(cel.coordX, 0);
		
		}
	}
	
	
	public synchronized void setUnidad(Unidad unidad){
		uni=unidad;
	}
	public void vaciarUnidad(){
		uni=null;
	}
	/*
	 * POR AHORA NO LO BORRO PERO NO HACE NADA :D
	 */
	public synchronized void resetCode(){
		//code[0];
	}
	public String toString(){
		int cood=coordX*coordY;
		return ("Celda: "+cood+" "+map+" "+obj+" "+" "+uni+" "+coordX+" "+coordY+" "+code);
	}
	public String obtenerCoordenada(){
		return ("x: "+coordX+"y: "+coordY);
	}
	public Celda obtenerCelda(int x, int y){
		return map.obtenerCelda(x, y);
	}
	
	public synchronized void accept (Visitor v){ //DELEGA 

			 uni.accept(v);
		

	}
	public void matarDuende(Duende d){
		map.matarDuende(d);
	}

}
