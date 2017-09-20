package Mapa;

import java.lang.management.ManagementPermission;
import java.util.HashMap;
import java.util.Random;

import Unidades.Caballero;
import Unidades.Unidad;

public class logicaMapa implements Runnable{
	static Mapa map;
	static HashMap<String, Unidad> mapeo=new HashMap<String, Unidad>();
	//Caballero unidadDeMuestra;
	//Caballero unidadDeMuestra2;
	
	public logicaMapa(){
		map=new Mapa(); //ESTE MAPA ES EL QUE VINCULA LOGICA-GUI
	
		//unidadDeMuestra= generarCaballero();
		//unidadDeMuestra2= generarCaballeroVertical();
		//map.obtenerCelda(0, 16).setUnidad(unidadDeMuestra);
		//mapeo.put(unidadDeMuestra.getNombre() , unidadDeMuestra);
		//map.obtenerCelda(0, 8).setUnidad(unidadDeMuestra);
		//mapeo.put(unidadDeMuestra2.getNombre() , unidadDeMuestra2);
		
		for(int i=0;i<32;i++){
			//int rnd=new Random().nextInt(31); //Fila de Spawn
			Caballero aux=generarCaballeroRandom(i);
			aux.setVelocidad(new Random().nextInt(200)); //Velocidad variable aleatoria :D
			map.obtenerCelda(0, i).setUnidad(aux);
			mapeo.put(aux.getNombre(), aux);
		}
	}
	
	public static void main(String [] arg){
	
		new logicaMapa();
		
		
	}
	public Mapa obtenerMapa(){
		return map;
	}
	private static Caballero generarCaballero(){
		
		Caballero robert=new Caballero("robert", map.obtenerCelda(0, 16));
		
		
		return robert;
	}
	
	private static Caballero generarCaballeroVertical(){
		
		Caballero robert2=new Caballero("robert2", map.obtenerCelda(0, 8));
		
		
		return robert2;
	}
	
	private static Caballero generarCaballeroRandom(int i){
		
		Caballero robert2=new Caballero("robert"+i, map.obtenerCelda(0, i));
		
		
		return robert2;
	}
	
	public HashMap<String,Unidad> obtenerUnidades(){
		return mapeo;
	}

	@Override
	public synchronized void run() {

		
	}
	
		
	}
	