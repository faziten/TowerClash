package Objeto;

import javax.swing.Timer;

public abstract class Temporales extends Objeto{
	protected int tiempo;
	protected Timer temporizador;
	
	public void setTiempo(int t){
		this.tiempo = t;
	}
	
	public int getTiempo(){
		return tiempo;
	}
	
	public void iniciar()
	{
		temporizador.start();	
	}
	
	public Timer getTemporizador()
	{
		return temporizador;
	}
	
}
