package Mapa;

import java.lang.management.ManagementPermission;
import java.util.HashMap;
import java.util.Random;

import Unidades.Caballero;
import Unidades.Unidad;

public class logicaMapa implements Runnable{
	static Mapa map;
	static HashMap<String, Unidad> mapeo=new HashMap<String, Unidad>();

	
	public logicaMapa(){
		map=new Mapa(); //ESTE MAPA ES EL QUE VINCULA LOGICA-GUI
	
																							//GENERACION DE CABALLEROS	
		for(int i=0;i<32;i++){																//
			//int rnd=new Random().nextInt(31); //Fila de Spawn								//
			Caballero aux=generarCaballeroRandom(i);										//
			aux.setDireccion("derecha");
			aux.setVelocidad(new Random().nextInt(20));
			map.obtenerCelda(0, i).setUnidad(aux);
			mapeo.put(aux.getNombre(), aux);
			
			Caballero auxY=generarCaballeroRandomY(i);
			auxY.setDireccion("abajo");
			auxY.setVelocidad(new Random().nextInt(20));
			map.obtenerCelda(i, 0).setUnidad(auxY);
			mapeo.put(auxY.getNombre(), auxY); 
		}																					//
	}																						//////////////
	
	public static void main(String [] arg){
	
		new logicaMapa();
		
		
	}
	public Mapa obtenerMapa(){
		return map;
	}

	
	private static Caballero generarCaballeroRandom(int i){
		
		Caballero robert2=new Caballero("robert"+i, map.obtenerCelda(0, i));
		
		
		
		
		return robert2;
	}
	
	private static Caballero generarCaballeroRandomY(int i){
		
		
		Caballero robert3=new Caballero("robertY"+i, map.obtenerCelda(i, 0));
		
		
		
		return robert3;
	}
	
	public HashMap<String,Unidad> obtenerUnidades(){
		return mapeo;
	}

	@Override
	public synchronized void run() {

		
	}
	
		
	}
	