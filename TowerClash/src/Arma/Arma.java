package Arma;

import Main.Visitor;

public class Arma {
	
	protected String nombre;
	
	public Arma(String nombre){
		this.nombre=nombre;
	}
	
	//public boolean deshabilitar(){    
	//Hay que revisar esto, no creo que tenga sentido. 
	//} 
	
	public void accept(Visitor visitor){
		
	}
	
	public String getNombre(){
		return nombre;
	}
}
