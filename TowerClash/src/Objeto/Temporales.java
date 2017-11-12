package Objeto;

public abstract class Temporales extends Objeto{
	protected int tiempo=50;
	
	public int getTiempo(){
		return tiempo;
	}
	
	public void descontarTiempo(){
		tiempo--;
	}

}
