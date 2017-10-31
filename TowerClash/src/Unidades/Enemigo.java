package Unidades;

public abstract class Enemigo extends Unidad{
	public int puntos;
	public int velocidad;
	
	//Retorna la velocidad de cada enemigo.
	public int getVelocidad(){
		return velocidad;
	}
	
	//Retorna los puntos que otorga cuando muere
	public int puntos(){
		return puntos;
	}
	
	abstract public void mover();
	
}
