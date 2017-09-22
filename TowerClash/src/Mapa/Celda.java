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
	protected int code;
	
	
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
		this.code=code;
		//Nota: Si la cagamos tira ClassCastExc.
	}
	/**
	 * Construye una celda con solo el mapa pasado por parámetro.
	 * @param m mapa
	 */
	
	public Celda(Mapa m, int x, int y){
		new Celda(m, null, null, null, x, y, 0);
	}
	
	
	
	public int obtenerCode(){
		return code;
	}
	public void setCode(int code){
		//System.out.println("SETIE CODE EN "+code+" DE "+this);
		//System.out.println(map.printCodes());
		this.code=code;
		
	    	
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
	
	
	public void setUnidad(Unidad unidad){
		uni=unidad;
	}
	public void vaciarUnidad(){
		uni=null;
	}
	public void resetCode(){
		code=1;
	}
	public String toString(){
		int pene=coordX*coordY;
		return ("Celda: "+pene+" "+map+" "+obj+" "+eve+" "+uni+" "+coordX+" "+coordY+" "+code);
	}
	public String obtenerCoordenada(){
		return ("x: "+coordX+"y: "+coordY);
	}
}
