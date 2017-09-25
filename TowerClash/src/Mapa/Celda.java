package Mapa;

import java.util.Random;
import Evento.Evento;
import GUI.Sonidor;
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
	public Celda(Mapa m, Objeto o, Evento e, Unidad u, int x, int y, int code){
		map=m;
		obj=o;
		eve=e;
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
		new Celda(m, null, null, null, x, y, 0);
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
		//System.out.println(map.printCodes());
		if(fondo!=-1)
			code[0]=fondo;
		if(unidad!=-1)
			code[1]=unidad;
		if(powUp!=-1)
			code[2]=powUp;
		if(evento!=-1)
		code[3]=evento;
		
	    	
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
		int pene=coordX*coordY;
		return ("Celda: "+pene+" "+map+" "+obj+" "+eve+" "+uni+" "+coordX+" "+coordY+" "+code);
	}
	public String obtenerCoordenada(){
		return ("x: "+coordX+"y: "+coordY);
	}
}
