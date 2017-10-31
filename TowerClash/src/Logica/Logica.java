package Logica;

import java.util.HashMap;

import Mapa.Mapa;
import Unidades.*;

public class Logica implements Runnable {
	protected volatile static Mapa map;
	protected volatile static HashMap<String, Unidad> mapeo=new HashMap<String, Unidad>();
	protected int puntaje=0;
	
	public Logica(){
		map=new Mapa(); //ESTE MAPA ES EL QUE VINCULA LOGICA-GUI
		map.setLogica(this);
	}
	public static void main(String [] arg){
	
		new Logica();
		
		
	}
	public Mapa obtenerMapa(){
		return map;
	}
	
	public HashMap<String,Unidad> obtenerUnidades(){
		return mapeo;
	}
	
	public synchronized int getPuntaje(){
		return puntaje;
	}
	
	public synchronized void sumarPuntos(int puntos){
		puntaje+=puntos;
	}

	public static synchronized Caballero generarCaballeroRandom(int x, int i){
		
		Caballero robert2=new Caballero("robert"+i, map.obtenerCelda(x, i));
		//robert2.setDireccion("derecha");													//
		map.obtenerCelda(x, i).setUnidad(robert2);											//
		mapeo.put(robert2.getNombre(), robert2);
		System.out.println(robert2.getNombre()+" ha nacido.");
		
		
		
		return robert2;
	}
	
	public static synchronized Duende generarDuendeRandom(int x, int i){
		
		Duende carlitos=new Duende("carlitos"+i, map.obtenerCelda(x, i));
		//carlitos.setDireccion("izquierda");													//
		map.obtenerCelda(x, i).setUnidad(carlitos);											//
		mapeo.put(carlitos.getNombre(), carlitos);
		System.out.println(carlitos.getNombre()+" ha nacido.");
		
		
		
		return carlitos;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public void matarDuende(Duende d){
		mapeo.remove(d.getNombre());
	}
	
}
