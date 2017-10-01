package Unidades;

public abstract class Terrestre extends Unidad{
	protected String direccion;

	//SETTER TRIVIAL
	public synchronized void setDireccion(String dir){
		direccion=dir;
	}

}
