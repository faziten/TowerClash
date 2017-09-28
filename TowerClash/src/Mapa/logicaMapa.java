package Mapa;

import java.lang.management.ManagementPermission;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Random;

import Unidades.Caballero;
import Unidades.Duende;
import Unidades.Unidad;

public class logicaMapa implements Runnable{
	protected volatile static Mapa map;
	protected volatile static HashMap<String, Unidad> mapeo=new HashMap<String, Unidad>();
	protected int puntaje=0;

	
	public logicaMapa(){
		map=new Mapa(); //ESTE MAPA ES EL QUE VINCULA LOGICA-GUI	
		/*																					//GENERACION DE 64 CABALLEROS
		for(int i=0;i<32;i++){																//
			//int rnd=new Random().nextInt(31); //Fila de Spawn								//
			Caballero aux=generarCaballeroRandom(i);										//
			aux.setDireccion("derecha");													//
			aux.setVelocidad(new Random().nextInt(20));										//
			map.obtenerCelda(0, i).setUnidad(aux);											//
			mapeo.put(aux.getNombre(), aux);
			
			Caballero auxY=generarCaballeroRandomY(i);
			auxY.setDireccion("abajo");
			auxY.setVelocidad(new Random().nextInt(20));
			map.obtenerCelda(i, 0).setUnidad(auxY);
			mapeo.put(auxY.getNombre(), auxY); 
		}*/																					//
	}																						//////////////
	
	public static void main(String [] arg){
	
		new logicaMapa();
		
		
	}
	public Mapa obtenerMapa(){
		return map;
	}

	
	public static synchronized Caballero generarCaballeroRandom(int i){
		
		Caballero robert2=new Caballero("robert"+i, map.obtenerCelda(0, i));
		robert2.setDireccion("derecha");													//
		robert2.setVelocidad(10);										// PARA SPRINT 2 Y 3
		map.obtenerCelda(0, i).setUnidad(robert2);											//
		mapeo.put(robert2.getNombre(), robert2);
		System.out.println(robert2.getNombre()+" ha nacido.");
		
		
		
		return robert2;
	}
	
	public static synchronized Duende generarDuendeRandom(int i){
		
		Duende carlitos=new Duende("carlitos"+i, map.obtenerCelda(0, i));
		carlitos.setDireccion("izquierda");													//
		carlitos.setVelocidad(10);										// PARA SPRINT 2 Y 3
		map.obtenerCelda(0, i).setUnidad(carlitos);											//
		mapeo.put(carlitos.getNombre(), carlitos);
		System.out.println(carlitos.getNombre()+" ha nacido.");
		
		
		
		return carlitos;
	}
	
	//private static Caballero generarCaballeroRandomY(int i){
		
		
		//Caballero robert3=new Caballero("robertY"+i, map.obtenerCelda(i, 0));
		
		
		
		//return robert3;
	//}
	
	public HashMap<String,Unidad> obtenerUnidades(){
		return mapeo;
	}

	public synchronized int getPuntaje(){
		return puntaje;
	}
	public synchronized void sumarPuntos(int puntos){
		puntaje+=puntos;
	}
	
	public synchronized void destruirCaballero(int i){
		Caballero c=(Caballero)mapeo.get("robert"+i);  // ES UN SIMPLE CHECK POSITION NO ME MATEN JAJA.
		if(c!=null){
			puntaje+=c.getPuntos();
			c.die();
			System.out.println(c.getNombre()+" ha muerto.");
			mapeo.remove(c.getNombre());	
		}
		
	}
	
	public synchronized int destruirDuende(int i){
		Duende c=(Duende)mapeo.get("carlitos"+i);  // ES UN SIMPLE CHECK POSITION NO ME MATEN JAJA.
		int j=i;
		boolean encontre=false;
		while(j<32 && !encontre){
			c=(Duende)mapeo.get("carlitos"+i);
			if(c!=null)
				encontre=true;
				else
					j++;
		}
		if(encontre){
			puntaje+=c.getPuntos();
			c.die();
			System.out.println(c.getNombre()+" ha muerto.");
			mapeo.remove(c.getNombre());
			return j;
		}else
			return 666;
	}
	
	
	@Override
	public synchronized void run() {

		
	}
	
		
	}
	