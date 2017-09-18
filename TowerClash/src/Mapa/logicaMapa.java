package Mapa;

import java.lang.management.ManagementPermission;
import java.util.HashMap;

import Unidades.Caballero;
import Unidades.Unidad;

public class logicaMapa implements Runnable{
	static Mapa map;
	HashMap<String, Unidad> mapeo=new HashMap<String, Unidad>();
	Caballero unidadDeMuestra;
	
	public logicaMapa(){
		map=new Mapa(); //ESTO ANDA
	
		unidadDeMuestra= generarCaballero();
		
		map.obtenerCelda(5, 16).setUnidad(unidadDeMuestra);
		mapeo.put(unidadDeMuestra.getNombre() , unidadDeMuestra);
		
	}
	
	public static void main(String [] arg){
	
		new logicaMapa();
		
	}
	public Mapa obtenerMapa(){
		return map;
	}
	private static Caballero generarCaballero(){
		
		Caballero robert=new Caballero("robert", map.obtenerCelda(5, 16));
		
		return robert;
	}
	
	public HashMap<String,Unidad> obtenerUnidades(){
		return mapeo;
	}

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		
	}
	
		
	}
	